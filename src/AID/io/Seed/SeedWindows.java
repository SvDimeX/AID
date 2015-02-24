package AID.io.Seed;

import AID.io.IOOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 23.02.15.
 */
public class SeedWindows {
    static HashMap<String, List<String>> sysConf = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> basicConf = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> userConf = new HashMap<String, List<String>>();

    public static void main(String[] args) throws Exception {
        //Synthesizer.speak(" AID system configuration seeding...");
        fillinProp();
        IOOperation.writeObjFile("src/resources/configuration/System.properties", sysConf);//Записування безпосередньо до файлу
        System.out.println("System Properties write!");
        fillinBasicConf();
        IOOperation.writeObjFile("src/resources/configuration/Basic.config", basicConf);//Записування безпосередньо до файлу
        System.out.println("Basic Configuration write!");
    }

    private static void fillinProp() {
        sysConf.put("Atribute", Arrays.asList(new String[]{"Equals"}));
        sysConf.put("firstRun", Arrays.asList(new String[]{"false"}));
        sysConf.put("systType", Arrays.asList(new String[]{"windows"}));
        sysConf.put("systLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("inputLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("outputLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("systVoice", Arrays.asList(new String[]{"kevin16"}));
        sysConf.put("defaultMusicPlayer", Arrays.asList(new String[]{""}));
        sysConf.put("defaultVideoPlayer", Arrays.asList(new String[]{""}));
        sysConf.put("defaultBrowser", Arrays.asList(new String[]{"chrome"}));
        for (String key : sysConf.keySet()) {
            String text = key + ": -- " + sysConf.get(key).get(0);
            System.out.println(text);
        }
    }

    private static void fillinBasicConf() {
        basicConf.put("000", Arrays.asList(new String[]{"Type", "Request", "Response", "Command"}));
        basicConf.put("001", Arrays.asList(new String[]{"main", "AID come back", "I am online and ready!", ""}));
        basicConf.put("002", Arrays.asList(new String[]{"main", "AID off transmitter", "All advanced regognition functions stoped!", ""}));
        basicConf.put("003", Arrays.asList(new String[]{"main", "Close aid system", "You are sure?", ""}));
        basicConf.put("004", Arrays.asList(new String[]{"main", "Yes", "", ""}));
        basicConf.put("005", Arrays.asList(new String[]{"main", "No", "", ""}));

//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));

        basicConf.put("showComandTree", Arrays.asList(new String[]{"oher", "Show command tree", "", ""}));

        for (String key : basicConf.keySet()) {
            String text = key + ": " + basicConf.get(key).get(0) + " " + basicConf.get(key).get(1) + " " + basicConf.get(key).get(2) + " " + basicConf.get(key).get(3);
            System.out.println(text);
        }

    }
}
