package AID.voice;

import AID.core.LogicCore;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.linguist.Linguist;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;

import java.io.IOException;
import java.net.URL;

/**
 * Created by dima-sv on 2/3/15.
 */
public class StartRecognize {
    /**
     * Програма для розпізнавання мовлення, теоретично розпізнає заздалегідь приготовлені команди */
    public StartRecognize() throws Exception {
        ConfigurationManager cm;
        LogicCore logicCore = new LogicCore();
        Synthesizer.speak("I am omline and ready!:");
        URL url;
        url = StartRecognize.class.getResource("mainAID.config.xml");
        cm = new ConfigurationManager(url);

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();
        Microphone microphone = (Microphone) cm.lookup("microphone");

        if (microphone.startRecording()) {
            while (true) {
                    /* This method will return when the end of speech
                     * is reached. Note that the endpointer will determine
                     * the end of speech. */
                Result result = recognizer.recognize();
                if (result != null) {
                    String resultText = result.getBestFinalResultNoFiller();
                    System.out.println("You said: " + resultText + "\n");
                    logicCore.whatDoing(resultText);

                } else if (result == null) {
                    System.out.println("I can't hear what you said.\n");
                }

                //swapGrammar("goodbye");
                //System.out.println("Start speaking using goodbye grammar");

//                result = recognizer.recognize();
//
//                if (result != null) {
//                    String resultText = result.getBestFinalResultNoFiller();
//                    System.out.println("You said: " + resultText + "\n");
//                } else {
//                    System.out.println("I can't hear what you said.\n");
//                }

                //swapGrammar("hello");
            }
        } else {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(1);
        }
        if (!microphone.startRecording()) {
            System.out.println("Can't Start Microphone");
            recognizer.deallocate();
            System.exit(0);
        }
    }

//    static void swapGrammar(String newGrammarName)
//            throws PropertyException, InstantiationException, IOException {
//        System.out.println("Swapping to grammar " + newGrammarName);
//        Linguist linguist = (Linguist) cm.lookup("flatLinguist");
//        linguist.deallocate();
//        //cm.setProperty("jsgfGrammar", "grammarName", newGrammarName);
//        linguist.allocate();
//    }
}
