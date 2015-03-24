package AID.io;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by dima-sv on 2/3/15.
 */
public class IOCommand {
    private String command;
    private static final Logger logger = Logger.getLogger(IOCommand.class);
    public void runCommand(String command) {
        this.command=command.toString();
        String[] cmd = {"/bin/sh", "-c", this.command};
//        String s;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
//            BufferedReader stdInput = new BufferedReader(new
//                    InputStreamReader(p.getInputStream()));
//            BufferedReader stdError = new BufferedReader(new
//                    InputStreamReader(p.getErrorStream()));
//            // read the output from the command
//            while ((s = stdInput.readLine()) != null) {
//                System.out.println("Here is the standard output of the command:\n");
//                System.out.println(s);
//            }
//            // read any errors from the attempted command
//            while ((s = stdError.readLine()) != null) {
//                System.out.println("Here is the standard error of the command (if any):\n");
//                System.out.println(s);
//            }
        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            logger.error(e);
            System.exit(-1);
        }
    }
}