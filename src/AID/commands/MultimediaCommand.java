package AID.commands;

import AID.io.IOCommand;

/**
 * Created by dima-sv on 2/3/15.
 */
public class MultimediaCommand {

    static IOCommand run = new IOCommand();

    public static void bansheeCommand(String recString) {
        if (recString.contains("banshee show")) {
            run.runCommand("banshee");
        }
        if (recString.contains("banshee hide")) {
            run.runCommand("banshee --hide");
        }
        if (recString.contains("play music")) {
            run.runCommand("banshee --play");
        }
        if (recString.contains("pause music")) {
            run.runCommand("banshee --pause");
        }
        if (recString.contains("stop music")) {
            run.runCommand("banshee --pause");
        }
        if (recString.contains("next music")) {
            run.runCommand("banshee --next");
        }
        if (recString.contains("music back")) {
            run.runCommand("banshee --previous");
        }
        if (recString.contains("volume zero")) {
            run.runCommand("banshee --set-volume=0");
        }
        if (recString.contains("half volume")) {
            run.runCommand("banshee --set-volume=50");
        }
        if (recString.contains("volume max")) {
            run.runCommand("banshee --set-volume=100");
        }
    }
    public static void skypeCommand(String recString){
        if (recString.contains("call to mother")){
            run.runCommand("skype --callto gazduny");
        }
    }
}
