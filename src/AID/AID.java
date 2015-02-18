package AID;

import AID.form.MainForm;
import AID.io.IOOperation;
import AID.voice.StartRecognize;
import AID.voice.Synthesizer;

import java.util.*;

public class AID {

    public static void main(String[] args) throws Exception {
        Synthesizer.speak(" AID system initializing...");
        new MainForm();
//        Synthesizer.speak("All system ready");
        new StartRecognize();
//        HashMap<String, List<String>> sysProp=IOOperation.loadProperties("src/resources/configuration/System.properties");
//        System.out.println(sysProp.get("systType").get(0).toString());
//        for (String key : sysProp.keySet()) {
//            String text=key+": "+sysProp.get(key).get(0);
//            System.out.println(text);
//        }

//        HashMap<String, List<String>> basicConfig=IOOperation.loadProperties("src/resources/configuration/Basic.config");
//        System.out.println(basicConfig.get("001").get(0) + "; " + basicConfig.get("001").get(1)+"; "+basicConfig.get("001").get(2)+".");
//        for (String key : basicConfig.keySet()) {
//            String text=key+": "+basicConfig.get(key).get(0) + " " + basicConfig.get(key).get(1)+" "+basicConfig.get(key).get(2);
//            System.out.println(text);
//        }
    }
}