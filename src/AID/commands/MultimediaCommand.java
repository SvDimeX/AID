package AID.commands;

import AID.io.IOCommand;
import AID.io.IOOperation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/3/15.
 */
public class MultimediaCommand {

    static IOCommand run = new IOCommand();

    public static void multimediaCommand(String type, String recString) throws IOException, ClassNotFoundException {

        HashMap<String, List<String>> basicConfig= IOOperation.loadProperties("src/resources/configuration/Basic.config");
        for (String key : basicConfig.keySet()) {
            if (type.equalsIgnoreCase(basicConfig.get(key).get(0).toString())){
                if (recString.equalsIgnoreCase(basicConfig.get(key).get(1))) {
                    run.runCommand(basicConfig.get(key).get(3));
                }
            }
        }

    }
    public static void bansheeCommand(String recString) {
        if (recString.contains("banshee show")) {
            run.runCommand("amarok");
        }
//        if (recString.contains("banshee hide")) {
//            run.runCommand("banshee --hide");
//        }
        if (recString.contains("play music")) {
            run.runCommand("amarok --play");
        }
        if (recString.contains("pause music")) {
            run.runCommand("amarok --pause");
        }
        if (recString.contains("stop music")) {
            run.runCommand("amarok --pause");
        }
        if (recString.contains("next music")) {
            run.runCommand("amarok --next");
        }
        if (recString.contains("music back")) {
            run.runCommand("amarok --previous");
        }
        if (recString.contains("close banshee")) {
            run.runCommand("killall amarok");

        }
//-----------------------------------------------------//
        if (recString.contains("volume mute")) {
            run.runCommand("amixer set Master mute");
        }
        if (recString.contains("volume unmute")) {
            run.runCommand("amixer set Master unmute");
        }
        if (recString.contains("volume zero")) {
            run.runCommand("amixer set Master 0 ");
        }
        if (recString.contains("half volume")) {
            run.runCommand("amixer set Master 50 ");
        }
        if (recString.contains("volume max")) {
            run.runCommand("amixer set Master 100");
        }
        if (recString.contains("volume up")) {
            run.runCommand("amixer set Master 10%+");
        }
        if (recString.contains("volume down")) {
            run.runCommand("amixer set Master 10%-");
        }

    }
    public static void totemCommand(String recString) {
        if (recString.contains("totem show")) {
            run.runCommand("totem");
        }
        if (recString.contains("play video")) {
            run.runCommand("totem --play");
        }
        if (recString.contains("pause video ")) {
            run.runCommand("totem --play-pause");
        }
        if (recString.contains("video stop")) {
            run.runCommand("totem --pause");
        }
        if (recString.contains("next video")) {
            run.runCommand("totem --next");
        }
        if (recString.contains("previous video")) {
            run.runCommand("totem --previous");
        }
        if (recString.contains("back video")) {
            run.runCommand("totem --seek-bwd");
        }
        if (recString.contains("forward video")) {
            run.runCommand("totem --seek-fwd");
        }
        if (recString.contains("volume up")) {
            run.runCommand("totem --volume-up");
        }
        if (recString.contains("volume down")) {
            run.runCommand("totem --volume-down");
        }
        if (recString.contains("close totem")) {
            run.runCommand("killall totem");
        }
    }
    public static void skypeCommand(String recString){
        if (recString.contains("call to mother")){
            run.runCommand("skype --callto gazduny");
        }
    }
}
