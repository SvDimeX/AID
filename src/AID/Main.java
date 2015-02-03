package AID;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public void a() {
        String text;
        // create map
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        // set values
        map.put("000", Arrays.asList(new String[]{"Запитання", "Відповідь", "Дія"}));
        map.put("001", Arrays.asList(new String[]{"Hello", "Hi", ""}));
        map.put("002", Arrays.asList(new String[]{"Open music", "ok", "banshee"}));

        // check if has at least one column
        if (map.size() < 1)
            return;
        String pathToFile = "file.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            bw.write(map.toString());
//            bw.write(System.lineSeparator());
            for (String key : map.keySet()) {
//            System.out.print(map.get(key).get(0) + " " + map.get(key).get(1)+" "+map.get(key).get(2));
            text=key+" "+map.get(key).get(0) + " " + map.get(key).get(1)+" "+map.get(key).get(2);

            System.out.println(text);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Init Project");
        new Main().a();
    }
}
