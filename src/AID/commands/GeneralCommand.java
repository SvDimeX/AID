package AID.commands;

import AID.form.CommandTreeForm;
import AID.io.IOCommand;
import AID.voice.Synthesizer;


/**
 * Created by dima-sv on 2/7/15.
 */
public class GeneralCommand {
    static IOCommand run = new IOCommand();
    static boolean preclose = false, preShotDown = false;
    static CommandTreeForm commandTreeForm;
    public static void generalCommand(String recString) {

        if (recString.contains("close aid system")) {
            Synthesizer.speak("You are sure?");
            preclose = true;
        }
        if (recString.contains("no")) {
            preclose = false;
        }
        if ((recString.contains("yes")) && preclose == true) {
            System.exit(0);
        }

        if (recString.contains("show command tree")) {
            commandTreeForm = new CommandTreeForm();
        }
        if (recString.contains("Close command tree")) {
           commandTreeForm.dispose();
        }

        if (recString.contains("open music folder")) {
            run.runCommand("xdg-open ~/Music");
        }
        if (recString.contains("open video folder")) {
            run.runCommand("xdg-open ~/Videos");
        }

        if (recString.contains("shut down computer")) {
            Synthesizer.speak("You are sure?");
            preShotDown = true;
        }
        if (recString.contains("no")) {
            preShotDown = false;
        }
        if ((recString.contains("yes")) && preShotDown == true) {
            String operatingSystem = System.getProperty("os.name");
            if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
                //TODO shutdown: Need to be root
                run.runCommand("shutdown -h now");
                System.exit(0);
            } else if ("Windows".equals(operatingSystem)) {
                run.runCommand("shutdown.exe -s -t 0");
            } else {
                throw new RuntimeException("Unsupported operating system.");
            }
        }

    }
}
