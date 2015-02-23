package AID.core.linux;

import AID.commands.*;
import AID.io.IOOperation;
import AID.voice.Synthesizer;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 23.02.15.
 */
public class WidowsLogicCore {
    static boolean listening=true;
    static GeneralCommand generalCommand = new GeneralCommand();
    static KeyBoardCommand keyBoardCommand = new KeyBoardCommand();


    public static void whatDoing(String recString) throws Exception {
        HashMap<String, List<String>> basicConfig = IOOperation.loadProperties("src/resources/configuration/Basic.config");
        if (recString.contains("aid come back")) {
            Synthesizer.speak("I am online and ready!");
            listening = true;
        }
        if (listening) {
            if (recString.contains("aid off transmitter")) {
                Synthesizer.speak("All advanced regognition functions stoped!");
                listening = false;
            }

            generalCommand.generalCommand(recString);

            keyBoardCommand.keyboardCommand(recString);

        }
    }
}
