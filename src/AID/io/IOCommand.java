package AID.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dima-sv on 2/3/15.
 */
public class IOCommand {
    public void runCommand(String command) {
        String[] cmd = {"/bin/sh", "-c", command.toString()};
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
            System.exit(-1);
        }
    }
}
