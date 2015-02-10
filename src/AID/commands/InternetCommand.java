package AID.commands;

import AID.io.IOCommand;

/**
 * Created by dima-sv on 2/10/15.
 */
public class InternetCommand {
static IOCommand run = new IOCommand();
    public static void brouserCommand(String recString){
        if (recString.contains("open browser")) {
            run.runCommand("x-www-browser");
        }
        if (recString.contains("close browser")) {
            run.runCommand("killall chrome");
        }
        if (recString.contains("open face book page")) {
            run.runCommand("xdg-open http://facebook.com");
        }
    }
}
