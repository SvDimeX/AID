package AID.io.Seed;

import AID.io.IOOperation;
import AID.io.Seed.linux.BasicLinuxEN_Config;
import AID.io.Seed.linux.BasicLinuxUA_Config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/24/15.
 */
public class Seed {
    static HashMap<String, List<String>> sysConf = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> basicConfEN = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> basicConfUA = new HashMap<String, List<String>>();

    static String lang="Ukr";
    static String system="linux";

    public static void main(String[] args) throws Exception {
        fillinProp();
        IOOperation.writeObjFile("src/resources/configuration/System.properties", sysConf);//Записування безпосередньо до файлу
        System.out.println("System Properties write!");

        if(lang=="Eng") {
            basicConfEN = BasicLinuxEN_Config.fillinBasicConf(sysConf);
            IOOperation.writeObjFile("src/resources/configuration/BasicEN.config", basicConfEN);//Записування безпосередньо до файлу
            System.out.println("Basic Configuration write!");
        } else if (lang=="Ukr") {
            basicConfUA = BasicLinuxUA_Config.fillinBasicConf(sysConf);
            IOOperation.writeObjFile("src/resources/configuration/BasicUA.config", basicConfUA);//Записування безпосередньо до файлу
            System.out.println("Basic Configuration write!");
        }
    }

    private static void fillinProp() {
        sysConf.put("Atribute", Arrays.asList(new String[]{"Equals"}));
        sysConf.put("firstRun", Arrays.asList(new String[]{"false"}));
        sysConf.put("systType", Arrays.asList(new String[]{system}));
        sysConf.put("systLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("inputLang", Arrays.asList(new String[]{lang}));
        sysConf.put("outputLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("systVoice", Arrays.asList(new String[]{"kevin16"}));
        sysConf.put("defaultMusicPlayer", Arrays.asList(new String[]{"amarok"}));
        sysConf.put("defaultVideoPlayer", Arrays.asList(new String[]{"totem"}));
        sysConf.put("defaultBrowser", Arrays.asList(new String[]{"chrome"}));
        for (String key : sysConf.keySet()) {
            String text = key + ": -- " + sysConf.get(key).get(0);
            System.out.println(text);
        }
    }
}
