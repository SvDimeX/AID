package AID.io.database;

import AID.io.IOOperation;
import AID.voice.Synthesizer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dima-sv on 2/16/15.
 */
public class Seed {
    static HashMap<String, List<String>> sysConf = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> basicConf = new HashMap<String, List<String>>();
    static HashMap<String, List<String>> userConf = new HashMap<String, List<String>>();

    public static void main(String[] args) throws Exception {
        //Synthesizer.speak(" AID system configuration seeding...");
        fillinProp();
        IOOperation.writeObjFile("src/resources/configuration/System.properties", sysConf);//Записування безпосередньо до файлу
        System.out.println("System Properties write!");
        IOOperation.writeObjFile("src/resources/configuration/Basic.properties", sysConf);//Записування безпосередньо до файлу
        System.out.println("Basic Properties write!");
    }

    private static void fillinProp() {
        sysConf.put("Atribute", Arrays.asList(new String[]{"Equals"}));
        sysConf.put("firstRun", Arrays.asList(new String[]{"false"}));
        sysConf.put("systType", Arrays.asList(new String[]{ "linux"}));
        sysConf.put("systLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("inputLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("outputLang", Arrays.asList(new String[]{"Eng"}));
        sysConf.put("systVoice", Arrays.asList(new String[]{"kevin16"}));
        sysConf.put("defaultMusicPlayer", Arrays.asList(new String[]{"amarok"}));
        sysConf.put("defaultVideoPlayer", Arrays.asList(new String[]{"totem"}));
        sysConf.put("defaultBrowser", Arrays.asList(new String[]{"chrome"}));
//        String text;
//        for (String key : sysConf.keySet()) {
////            System.out.print(map.get(key).get(0) + " " + map.get(key).get(1)+" "+map.get(key).get(2));
//            text=key+": -- "+sysConf.get(key).get(0);
//            System.out.println(text);
//        }
    }
    private static void fillinBasicProp() {
        basicConf.put("000", Arrays.asList(new String[]{"Request",              "Response",                 "Command"}));
        basicConf.put("001", Arrays.asList(new String[]{"AID come back",        "I am online and ready!",   ""}));
        basicConf.put("002", Arrays.asList(new String[]{"AID off transmitter",  "All advanced regognition functions stoped!",    ""}));
        basicConf.put("003", Arrays.asList(new String[]{"Close aid system",     "You are sure?",      ""}));
        basicConf.put("004", Arrays.asList(new String[]{"Yes",                  "",      ""}));
        basicConf.put("005", Arrays.asList(new String[]{"No",                   "",      ""}));

        basicConf.put("006", Arrays.asList(new String[]{"open music control",   "", ""}));
        basicConf.put("007", Arrays.asList(new String[]{"close music control",   "", ""}));
        basicConf.put("008", Arrays.asList(new String[]{"open mouse control",   "", ""}));
        basicConf.put("009", Arrays.asList(new String[]{"close mouse control",   "", ""}));
        basicConf.put("010", Arrays.asList(new String[]{"open video control",   "", ""}));
        basicConf.put("011", Arrays.asList(new String[]{"close video control",   "", ""}));
        basicConf.put("012", Arrays.asList(new String[]{"open internet control",   "", ""}));
        basicConf.put("013", Arrays.asList(new String[]{"close internet control",   "", ""}));
        basicConf.put("014", Arrays.asList(new String[]{"open telephone control",   "", ""}));
        basicConf.put("015", Arrays.asList(new String[]{"close telephone control",   "", ""}));

        basicConf.put("016", Arrays.asList(new String[]{"banshee show",   "",     sysConf.get("defaultMusicPlayer").get(0).toString()}));
        basicConf.put("017", Arrays.asList(new String[]{"play music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --play"}));
        basicConf.put("018", Arrays.asList(new String[]{"stop music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --pause"}));
        basicConf.put("019", Arrays.asList(new String[]{"pause music",    "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --pause"}));
        basicConf.put("020", Arrays.asList(new String[]{"next music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --next"}));
        basicConf.put("021", Arrays.asList(new String[]{"music back",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --previous"}));
        basicConf.put("022", Arrays.asList(new String[]{"close banshee",  "",     "killall "+sysConf.get("defaultMusicPlayer").get(0).toString()}));

        basicConf.put("023", Arrays.asList(new String[]{"volume zero",    "",     "amixer set Master 0"}));
        basicConf.put("024", Arrays.asList(new String[]{"half volume",    "",     "amixer set Master 50"}));
        basicConf.put("025", Arrays.asList(new String[]{"volume max",     "",     "amixer set Master 100"}));
        basicConf.put("026", Arrays.asList(new String[]{"volume mute",    "",     "amixer set Master mute"}));
        basicConf.put("027", Arrays.asList(new String[]{"volume unmute",  "",     "amixer set Master unmute"}));
        basicConf.put("028", Arrays.asList(new String[]{"volume up",      "",     "amixer set Master 20+"}));
        basicConf.put("029", Arrays.asList(new String[]{"volume down",    "",     "amixer set Master 20-"}));

        basicConf.put("030", Arrays.asList(new String[]{"totem show",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()}));
        basicConf.put("031", Arrays.asList(new String[]{"play video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --play"}));
        basicConf.put("032", Arrays.asList(new String[]{"video stop",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --pause"}));
        basicConf.put("033", Arrays.asList(new String[]{"pause video",    "",   sysConf.get("defaultVideoPlayer").get(0).toString()+" --pause"}));
        basicConf.put("034", Arrays.asList(new String[]{"next video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --next"}));
        basicConf.put("035", Arrays.asList(new String[]{"previous video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --previous"}));
        basicConf.put("036", Arrays.asList(new String[]{"forward video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --seek-fwd"}));
        basicConf.put("037", Arrays.asList(new String[]{"back video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --seek-bwd"}));
        basicConf.put("038", Arrays.asList(new String[]{"totem volume up",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --volume-up"}));
        basicConf.put("039", Arrays.asList(new String[]{"totem volume down",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --volume-down"}));
        basicConf.put("040", Arrays.asList(new String[]{"close totem",    "",    "killall "+sysConf.get("defaultVideoPlayer").get(0).toString()}));

        basicConf.put("041", Arrays.asList(new String[]{"left click",    "",    ""}));
        basicConf.put("042", Arrays.asList(new String[]{"right click",    "",    ""}));
        basicConf.put("043", Arrays.asList(new String[]{"middle click",    "",    ""}));
        basicConf.put("044", Arrays.asList(new String[]{"set position",    "",    ""}));
        basicConf.put("045", Arrays.asList(new String[]{"set one",    "",    ""}));
        basicConf.put("046", Arrays.asList(new String[]{"set two",    "",    ""}));
        basicConf.put("047", Arrays.asList(new String[]{"set three",    "",    ""}));
        basicConf.put("048", Arrays.asList(new String[]{"set four",    "",    ""}));
        basicConf.put("049", Arrays.asList(new String[]{"set five",    "",    ""}));
        basicConf.put("050", Arrays.asList(new String[]{"set six",    "",    ""}));
        basicConf.put("051", Arrays.asList(new String[]{"set seven",    "",    ""}));
        basicConf.put("052", Arrays.asList(new String[]{"set eight",    "",    ""}));
        basicConf.put("053", Arrays.asList(new String[]{"set nine",    "",    ""}));

        basicConf.put("054", Arrays.asList(new String[]{"open browser",    "",    "x-www-browser"}));
        basicConf.put("055", Arrays.asList(new String[]{"open face book page",    "",    "xdg-open http://facebook.com"}));
        basicConf.put("056", Arrays.asList(new String[]{"close browser",    "",    "killall "+sysConf.get("defaultBrowser").get(0).toString()}));
        basicConf.put("057", Arrays.asList(new String[]{"open music folder",    "",    "xdg-open ~/Music"}));
        basicConf.put("058", Arrays.asList(new String[]{"open video folder",    "",    "xdg-open ~/Videos"}));
        basicConf.put("059", Arrays.asList(new String[]{"open home folder",    "",    "xdg-open ~/"}));

        basicConf.put("060", Arrays.asList(new String[]{"call to mother",    "",    "skype --callto gazduny"}));

        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));


        basicConf.put("999", Arrays.asList(new String[]{"show all command",    "",    ""}));
    }
}
