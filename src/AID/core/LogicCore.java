package AID.core;

import AID.commands.*;
import AID.io.IOCommand;
import AID.io.IOOperation;
import AID.io.InputOutputInterface;
import AID.voice.Synthesizer;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.*;

/**
 * Created by dima-sv on 2/3/15.
 */
public class LogicCore {
    static boolean listening=true, preclose=false, musicControl=false, videoControl, mouseControl, skypeControl=false;
    static boolean internetControl=false;
    static MultimediaCommand multimediaCommand = new MultimediaCommand();
    static MouseCommand mouseCommand = new MouseCommand();
    static GeneralCommand generalCommand = new GeneralCommand();
    static InternetCommand internetCommand = new InternetCommand();
    static IOCommand run = new IOCommand();
    static KeyBoardCommand keyBoardCommand = new KeyBoardCommand();

    public static void whatDoing(String recString) throws Exception {
        HashMap<String, java.util.List<String>> basicConfig= IOOperation.loadProperties("src/resources/configuration/Basic.config");
        if (recString.contains("aid come back")){
            Synthesizer.speak("I am online and ready!");
            listening = true;
        }
        if (listening) {
            if (recString.contains("aid off transmitter")){
                Synthesizer.speak("All advanced regognition functions stoped!");
                listening = false;
            }

//            for (String key : basicConfig.keySet()) {
//                if (recString.equalsIgnoreCase(basicConfig.get(key).get(0).toString())) {
//                    run.runCommand(basicConfig.get(key).get(2).toString());
//                    String text=key+": "+basicConfig.get(key).get(0) + " " + basicConfig.get(key).get(1)+" "+basicConfig.get(key).get(2);
//                    System.out.println(text);
//
//                }
//
//            }


            if ((musicControl==false) && (recString.contains("enable music control"))) {
                Synthesizer.speak("music control established");
                musicControl = true;
            }
            if (musicControl){
//                multimediaCommand.bansheeCommand(recString);
                multimediaCommand.multimediaCommand("music", recString);
            }
            if ((musicControl==true) && (recString.contains("disable music control"))) {
                Synthesizer.speak("music control close");
                musicControl = false;
            }

            if ((videoControl==false) && (recString.contains("enable video control"))) {
                Synthesizer.speak("video control established");
                videoControl = true;
            }
            if (videoControl){
                multimediaCommand.multimediaCommand("video", recString);
            }
            if ((videoControl==true) && (recString.contains("disable video control"))) {
                Synthesizer.speak("video control closed");
                videoControl = false;
            }

            if ((mouseControl==false) && (recString.contains("enable mouse control"))) {
                Synthesizer.speak("mouse control established");
                mouseControl = true;
            }
            if (mouseControl){
               mouseCommand.mouseCommand(recString);
            }
            if ((mouseControl==true) &&(recString.contains("disable mouse control"))) {
                Synthesizer.speak("mouse control close");
                mouseControl = false;
            }

            if ((skypeControl==false) && (recString.contains("enable telephone control"))) {
                Synthesizer.speak("skype control established");
                skypeControl = true;
            }
            if (skypeControl){
                multimediaCommand.skypeCommand(recString);
            }
            if ((skypeControl==true) && (recString.contains("disable telephone control"))) {
                Synthesizer.speak("skype control close");
                skypeControl = false;
            }

            if ((internetControl==false) && (recString.contains("enable internet control"))) {
                Synthesizer.speak("internet control established");
                internetControl = true;
            }
            if (internetControl){
                internetCommand.brouserCommand(recString);
            }
            if ((internetControl==true) && (recString.contains("disable internet control"))) {
                Synthesizer.speak("internet control close");
                internetControl = false;
            }

            generalCommand.generalCommand(recString);

            keyBoardCommand.keyboardCommand(recString);

        }
    }
}
