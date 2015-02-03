package AID.voice;

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
     * Програма для розпізнавання мовлення, теоретично розпізнає заздалегідь приготовлені команди
     * @param args
     */
    static ConfigurationManager cm;

    public static void main(String[] args) throws IOException, InstantiationException {
        System.out.println("Starting...");
        URL url;
        url=StartRecognize.class.getResource("helloworld.config.xml");

        if (args.length>0){
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager(url);
        }

        Recognizer recognizer= (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();
        Microphone microphone=(Microphone) cm.lookup("microphone");

        if (microphone.startRecording()) {
            System.out.println("For start: Player && show");
            System.out.println("Avaible Command: Music && play | stop | next | back | silent");

            boolean run=false;
            while (true) {
                    /* This method will return when the end of speech
                     * is reached. Note that the endpointer will determine
                     * the end of speech. */
                Result result = recognizer.recognize();

                //String command="null";
                //String[] cmd = {"/bin/sh", "-c", command.toString()};
                //Process p = Runtime.getRuntime().exec(cmd);
//                BufferedReader stdInput = new BufferedReader(new
//                        InputStreamReader(p.getInputStream()));
//                BufferedReader stdError = new BufferedReader(new
//                        InputStreamReader(p.getErrorStream()));
//                String resultText1 = result.getBestFinalResultNoFiller();
//                System.out.println("You said: " + resultText1 + "\n");
                if (result != null) {
                    String resultText = result.getBestFinalResultNoFiller();
//                    System.out.println("You said: " + resultText + "\n");
                    if (resultText.contains("player show")) {
                        String[] cmd = {"/bin/sh", "-c", "banshee"};
                        System.out.println("You said: " + resultText + "\n");
                        Process p = Runtime.getRuntime().exec(cmd);
                        run=true;
                    }
                    if (run){
                        if (resultText.contains("music play")) {
                            String[] cmd = {"/bin/sh", "-c", "banshee --play"};

                            System.out.println("You said: " + resultText + "\n");
                            Process p = Runtime.getRuntime().exec(cmd);
                        }
                        if (resultText.contains("music stop")) {
                            String[] cmd = {"/bin/sh", "-c", "banshee --pause"};

                            System.out.println("You said: " + resultText + "\n");
                            Process p = Runtime.getRuntime().exec(cmd);
                        }
                        if (resultText.contains("music next")) {
                            String[] cmd = {"/bin/sh", "-c", "banshee --next"};

                            System.out.println("You said: " + resultText + "\n");
                            Process p = Runtime.getRuntime().exec(cmd);
                        }
                        if (resultText.contains("music back")) {
                            String[] cmd = {"/bin/sh", "-c", "banshee --previous"};

                            System.out.println("You said: " + resultText + "\n");
                            Process p = Runtime.getRuntime().exec(cmd);
                        }
                        if (resultText.contains("music silent")) {
                            run=false;
                        }
                        System.out.println("I can't hear what you said.\n");
                        System.out.println("You said: " + resultText + "\n");
                    }

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
        if (!microphone.startRecording()){
            System.out.println("Can't Start Microphone");
            recognizer.deallocate();
            System.exit(0);
        }
    }

    static void swapGrammar(String newGrammarName)
            throws PropertyException, InstantiationException, IOException {
        System.out.println("Swapping to grammar " + newGrammarName);
        Linguist linguist = (Linguist) cm.lookup("flatLinguist");
        linguist.deallocate();
        //cm.sesetProperty("jsgfGrammar", "grammarName", newGrammarName);
        linguist.allocate();
    }
}
