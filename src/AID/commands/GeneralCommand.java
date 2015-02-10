package AID.commands;

import AID.io.IOCommand;
import AID.voice.Synthesizer;


/**
 * Created by dima-sv on 2/7/15.
 */
public class GeneralCommand {
    static IOCommand run = new IOCommand();
    static boolean preclose=false, preShotDown=false;
    public static void generalCommand(String recString){

        if (recString.contains("close system")) {
            Synthesizer.speak("You are sure?");
            preclose=true;
        }
        if (recString.contains("no")) {
            preclose=false;
        }
        if ((recString.contains("yes"))&& preclose==true) {
            System.exit(0);
        }

        if (recString.contains("show all command")){
            System.out.println("#-------------Start---------------#");
            System.out.println("Show all command");
            System.out.println("AID off");
            System.out.println("AID come back");
            System.out.println("Close system && yes | no");
            System.out.println("Banshee show");
            System.out.println("Banshee hide");
            System.out.println("Play music");
            System.out.println("Stop music");
            System.out.println("Pause music");
            System.out.println("Next music");
            System.out.println("Music back");
            System.out.println("Volume zero");
            System.out.println("Volume max");
            System.out.println("Half volume");
            System.out.println("#-------------End----------------#");
        }

        if (recString.contains("shut down computer")) {
            Synthesizer.speak("You are sure?");
            preShotDown=true;
        }
        if (recString.contains("no")) {
            preShotDown=false;
        }
        if ((recString.contains("yes"))&& preShotDown==true) {
            String operatingSystem = System.getProperty("os.name");
//            if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
//shutdown: Need to be root
            run.runCommand("shutdown -h now");
            System.exit(0);
//            }
//            else if ("Windows".equals(operatingSystem)) {
//                run.runCommand("shutdown.exe -s -t 0");
//            }
//            else {
//                throw new RuntimeException("Unsupported operating system.");
        }
    }
}
