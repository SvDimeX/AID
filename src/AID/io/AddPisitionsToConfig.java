package AID.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dima-sv on 2/3/15.
 */
public class AddPisitionsToConfig {
    public static Map<String, List<String>> addPosition() throws IOException {
        Boolean doit = true;
        String line;
        String key, question, answer, command;
        System.out.println("If you want exit - input \"no\".");
        Map<String, List<String>> mapAdd = new HashMap<String, List<String>>();

        while (doit) {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Add To map? : ");
            line = buffer.readLine();
            if (line.toLowerCase().contains("yes")) {
                System.out.print("Input key: ");
                key = buffer.readLine();
                System.out.print("Input question: ");
                question = buffer.readLine();
                System.out.print("Input answer: ");
                answer = buffer.readLine();
                System.out.print("Input command: ");
                command = buffer.readLine();
                System.out.print("Your map: ");
                System.out.println(key + " - " + question + " | " + answer + " | " + command);
                System.out.println("Insert To map? : ");
                line = buffer.readLine();
                if (line.toLowerCase().contains("yes")) {
                    mapAdd.put(key, Arrays.asList(new String[]{question, answer, command}));
                }
            }

            if (line.toString().toLowerCase().contains(("no").toLowerCase().toString())) {
                System.out.println("Exit from editor.");
                break;
            }
        }
        return mapAdd;
    }
}
