package AID.voice;

import AID.core.LogicCore;
import AID.io.IOOperation;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import org.apache.log4j.Logger;

import java.net.URL;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/3/15.
 */
public class StartRecognize {
    /**
     * Програма для розпізнавання мовлення, теоретично розпізнає заздалегідь приготовлені команди
     */

    private static final Logger logger = Logger.getLogger(StartRecognize.class);
    private HashMap<String, List<String>> sysProp=IOOperation.loadProperties("src/resources/configuration/System.properties");

    public StartRecognize() throws Exception {
        ConfigurationManager cm;
        LogicCore logicCore = new LogicCore();
        Synthesizer.speak("I am online and ready!:");
        URL url=null;
        if (sysProp.get("inputLang").get(0).toLowerCase().contains("eng")) {
            url = StartRecognize.class.getResource("mainAID.config.xml");
        } else if (sysProp.get("inputLang").get(0).toLowerCase().contains("ukr")){
            url = StartRecognize.class.getResource("UAmainAID.config.xml");
        } else {
            logger.error("Config xml file for "+sysProp.get("inputLang").get(0)+" language does not exist!!!");
        }
        cm = new ConfigurationManager(url);

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();
        Microphone microphone = (Microphone) cm.lookup("microphone");

        if (microphone.startRecording()) {
            while (true) {
                /** This method will return when the end of speech is reached. Note that the endpointer will determine
                 * the end of speech. */
                Result result = recognizer.recognize();
                if (result != null) {
                    String resultText = result.getBestFinalResultNoFiller();
                    System.out.println("You said: " + resultText);
                    logger.info("Get Best Pronunciation Result: " + result.getBestPronunciationResult());
                    logger.info("Input text: " + resultText);
                    logicCore.logicCore(resultText);

                } else if (result == null) {
                    logger.warn("I can't hear what you said. Result string is Null");
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
            logger.error("Can't Start Microphone.");
            recognizer.deallocate();
            System.exit(1);
        }
        if (!microphone.startRecording()) {
            logger.error("Can't Start Microphone.");
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
