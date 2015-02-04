package AID;

import AID.form.MainForm;
import AID.voice.StartRecognize;
import AID.voice.Synthesizer;

import java.io.*;
import java.util.*;

public class AID {
    public void a() {
        String text;
        // create map
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Map<String, List<String>> map2 = new HashMap<String, List<String>>();
        // set values
        map.put("000", Arrays.asList(new String[]{"Запитання", "Відповідь", "Дія"}));
        map.put("001", Arrays.asList(new String[]{"Hello", "Hi", ""}));
        map.put("002", Arrays.asList(new String[]{"Open music", "ok", "banshee"}));
        map2.put("lang", Arrays.asList(new String[]{"ENG"}));

        for (String key : map.keySet()) {
//            System.out.print(map.get(key).get(0) + " " + map.get(key).get(1)+" "+map.get(key).get(2));
            text=key+" "+map.get(key).get(0) + " " + map.get(key).get(1)+" "+map.get(key).get(2);
            System.out.println(text);
        }
            for (String key : map2.keySet()) {
                text=key+" "+map2.get(key).get(0);
                System.out.println(text);
            }
    }

    public static void main(String[] args) throws IOException, InstantiationException {
       Synthesizer.speak("Hello I am freeTTS");
        new MainForm();
        new StartRecognize();
    }
}
