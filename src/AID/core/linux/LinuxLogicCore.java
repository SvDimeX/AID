package AID.core.linux;

import AID.commands.*;
import AID.io.IOOperation;
import AID.voice.Synthesizer;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 23.02.15.
 */
public class LinuxLogicCore {
    private static boolean listening = true, musicControl = false, videoControl = false, mouseControl = false;
    private static boolean internetControl = false, skypeControl = false;
    private static MultimediaCommand multimediaCommand = new MultimediaCommand();
    private static MouseCommand mouseCommand = new MouseCommand();
    private static GeneralCommand generalCommand = new GeneralCommand();
    private static InternetCommand internetCommand = new InternetCommand();
    private static KeyBoardCommand keyBoardCommand = new KeyBoardCommand();

    public static void whatDoing(String recString) throws Exception {
        HashMap<String, List<String>> basicConfig = IOOperation.loadProperties("src/resources/configuration/Basic.config");

        if (recString.toLowerCase().contains("Aid come back")) {
            Synthesizer.speak("I am online and ready!");
            listening = true;
        }
        if (listening) {
            if (recString.toLowerCase().contains("aid off transmitter")) {
                Synthesizer.speak("All advanced regognition functions stoped!");
                listening = false;
            }

            if ((musicControl == false) && (recString.toLowerCase().contains("enable music control"))) {
                Synthesizer.speak("music control established");
                musicControl = true;
            }
            if (musicControl) {
                multimediaCommand.multimediaCommand("music", recString);
            }
            if ((musicControl == true) && (recString.toLowerCase().contains("disable music control"))) {
                Synthesizer.speak("music control close");
                musicControl = false;
            }

            if ((videoControl == false) && (recString.toLowerCase().contains("enable video control"))) {
                Synthesizer.speak("video control established");
                videoControl = true;
            }
            if (videoControl) {
                multimediaCommand.multimediaCommand("video", recString);
            }
            if ((videoControl == true) && (recString.toLowerCase().contains("disable video control"))) {
                Synthesizer.speak("video control closed");
                videoControl = false;
            }

            if ((mouseControl == false) && (recString.toLowerCase().contains("enable mouse control"))) {
                Synthesizer.speak("mouse control established");
                mouseControl = true;
            }
            if (mouseControl) {
                mouseCommand.mouseCommand(recString);
            }
            if ((mouseControl == true) && (recString.toLowerCase().contains("disable mouse control"))) {
                Synthesizer.speak("mouse control close");
                mouseControl = false;
            }

            if ((skypeControl == false) && (recString.toLowerCase().contains("enable telephone control"))) {
                Synthesizer.speak("skype control established");
                skypeControl = true;
            }
            if (skypeControl) {
                multimediaCommand.skypeCommand(recString);
            }
            if ((skypeControl == true) && (recString.toLowerCase().contains("disable telephone control"))) {
                Synthesizer.speak("skype control close");
                skypeControl = false;
            }

            if ((internetControl == false) && (recString.contains("enable internet control"))) {
                Synthesizer.speak("internet control established");
                internetControl = true;
            }
            if (internetControl) {
                internetCommand.brouserCommand(recString);
            }
            if ((internetControl == true) && (recString.toLowerCase().contains("disable internet control"))) {
                Synthesizer.speak("internet control close");
                internetControl = false;
            }

            multimediaCommand.multimediaCommand("volume", recString);

            generalCommand.generalCommand(recString);

            keyBoardCommand.keyboardCommand(recString);


        }
    }
}
