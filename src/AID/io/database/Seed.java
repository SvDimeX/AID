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
        fillinBasicConf();
        IOOperation.writeObjFile("src/resources/configuration/Basic.config", basicConf);//Записування безпосередньо до файлу
        System.out.println("Basic Configuration write!");
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
        for (String key : sysConf.keySet()) {
            String  text=key+": -- "+sysConf.get(key).get(0);
            System.out.println(text);
        }
    }

    private static void fillinBasicConf() {
        basicConf.put("000", Arrays.asList(new String[]{"Type",     "Request",              "Response",                 "Command"}));
        basicConf.put("001", Arrays.asList(new String[]{"","AID come back",        "I am online and ready!",   ""}));
        basicConf.put("002", Arrays.asList(new String[]{"","AID off transmitter",  "All advanced regognition functions stoped!",    ""}));
        basicConf.put("003", Arrays.asList(new String[]{"","Close aid system",     "You are sure?",      ""}));
        basicConf.put("004", Arrays.asList(new String[]{"","Yes",                  "",      ""}));
        basicConf.put("005", Arrays.asList(new String[]{"","No",                   "",      ""}));

        basicConf.put("006", Arrays.asList(new String[]{"control",  "open music control",   "", ""}));
        basicConf.put("007", Arrays.asList(new String[]{"control",  "close music control",   "", ""}));
        basicConf.put("008", Arrays.asList(new String[]{"control",  "open mouse control",   "", ""}));
        basicConf.put("009", Arrays.asList(new String[]{"control",  "close mouse control",   "", ""}));
        basicConf.put("010", Arrays.asList(new String[]{"control",  "open video control",   "", ""}));
        basicConf.put("011", Arrays.asList(new String[]{"control",  "close video control",   "", ""}));
        basicConf.put("012", Arrays.asList(new String[]{"control",  "","open internet control",   "", ""}));
        basicConf.put("013", Arrays.asList(new String[]{"control",  "close internet control",   "", ""}));
        basicConf.put("014", Arrays.asList(new String[]{"control",  "open telephone control",   "", ""}));
        basicConf.put("015", Arrays.asList(new String[]{"control",  "close telephone control",   "", ""}));

        basicConf.put("016", Arrays.asList(new String[]{"music",    "banshee show",   "",     sysConf.get("defaultMusicPlayer").get(0).toString()}));
        basicConf.put("017", Arrays.asList(new String[]{"music",    "play music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --play"}));
        basicConf.put("018", Arrays.asList(new String[]{"music",    "stop music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --pause"}));
        basicConf.put("019", Arrays.asList(new String[]{"music",    "pause music",    "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --pause"}));
        basicConf.put("020", Arrays.asList(new String[]{"music",    "next music",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --next"}));
        basicConf.put("021", Arrays.asList(new String[]{"music",    "music back",     "",     sysConf.get("defaultMusicPlayer").get(0).toString()+" --previous"}));
        basicConf.put("022", Arrays.asList(new String[]{"music",    "close banshee",  "",     "killall "+sysConf.get("defaultMusicPlayer").get(0).toString()}));

        basicConf.put("023", Arrays.asList(new String[]{"music",    "volume zero",    "",     "amixer set Master 0"}));
        basicConf.put("024", Arrays.asList(new String[]{"music",    "half volume",    "",     "amixer set Master 50"}));
        basicConf.put("025", Arrays.asList(new String[]{"music",    "volume max",     "",     "amixer set Master 100"}));
        basicConf.put("026", Arrays.asList(new String[]{"music",    "volume mute",    "",     "amixer set Master mute"}));
        basicConf.put("027", Arrays.asList(new String[]{"music",    "volume mute off",  "",     "amixer set Master unmute"}));
        basicConf.put("028", Arrays.asList(new String[]{"music",    "volume up",      "",     "amixer set Master 20+"}));
        basicConf.put("029", Arrays.asList(new String[]{"music",    "volume down",    "",     "amixer set Master 20-"}));

        basicConf.put("030", Arrays.asList(new String[]{"video",    "totem show",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()}));
        basicConf.put("031", Arrays.asList(new String[]{"video",    "play video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --play"}));
        basicConf.put("032", Arrays.asList(new String[]{"video",    "video stop",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --pause"}));
        basicConf.put("033", Arrays.asList(new String[]{"video",    "pause video",    "",   sysConf.get("defaultVideoPlayer").get(0).toString()+" --pause"}));
        basicConf.put("034", Arrays.asList(new String[]{"video",    "next video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --next"}));
        basicConf.put("035", Arrays.asList(new String[]{"video",    "previous video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --previous"}));
        basicConf.put("036", Arrays.asList(new String[]{"video",    "forward video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --seek-fwd"}));
        basicConf.put("037", Arrays.asList(new String[]{"video",    "back video",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --seek-bwd"}));
        basicConf.put("038", Arrays.asList(new String[]{"video",    "totem volume up",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --volume-up"}));
        basicConf.put("039", Arrays.asList(new String[]{"video",    "totem volume down",    "",    sysConf.get("defaultVideoPlayer").get(0).toString()+" --volume-down"}));
        basicConf.put("040", Arrays.asList(new String[]{"video",    "close totem",    "",    "killall "+sysConf.get("defaultVideoPlayer").get(0).toString()}));

        basicConf.put("041", Arrays.asList(new String[]{"mouse",    "left click",    "",    ""}));
        basicConf.put("042", Arrays.asList(new String[]{"mouse",    "right click",    "",    ""}));
        basicConf.put("043", Arrays.asList(new String[]{"mouse",    "middle click",    "",    ""}));
        basicConf.put("044", Arrays.asList(new String[]{"mouse",    "set position",    "",    ""}));
        basicConf.put("045", Arrays.asList(new String[]{"mouse",    "set one",    "",    ""}));
        basicConf.put("046", Arrays.asList(new String[]{"mouse",    "set two",    "",    ""}));
        basicConf.put("047", Arrays.asList(new String[]{"mouse",    "set three",    "",    ""}));
        basicConf.put("048", Arrays.asList(new String[]{"mouse",    "set four",    "",    ""}));
        basicConf.put("049", Arrays.asList(new String[]{"mouse",    "set five",    "",    ""}));
        basicConf.put("050", Arrays.asList(new String[]{"mouse",    "set six",    "",    ""}));
        basicConf.put("051", Arrays.asList(new String[]{"mouse",    "set seven",    "",    ""}));
        basicConf.put("052", Arrays.asList(new String[]{"mouse",    "set eight",    "",    ""}));
        basicConf.put("053", Arrays.asList(new String[]{"mouse",    "set nine",    "",    ""}));

        basicConf.put("054", Arrays.asList(new String[]{"oher",    "open browser",    "",    "x-www-browser"}));
        basicConf.put("055", Arrays.asList(new String[]{"oher",    "open face book page",    "",    "xdg-open http://facebook.com"}));
        basicConf.put("056", Arrays.asList(new String[]{"oher",    "close browser",    "",    "killall "+sysConf.get("defaultBrowser").get(0).toString()}));
        basicConf.put("057", Arrays.asList(new String[]{"oher",    "open music folder",    "",    "xdg-open ~/Music"}));
        basicConf.put("058", Arrays.asList(new String[]{"oher",    "open video folder",    "",    "xdg-open ~/Videos"}));
        basicConf.put("059", Arrays.asList(new String[]{"oher",    "open home folder",    "",    "xdg-open ~/"}));

        basicConf.put("060", Arrays.asList(new String[]{"oher",    "call to mother",    "",    "skype --callto gazduny"}));

//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));

        basicConf.put("999", Arrays.asList(new String[]{"oher",    "show all command",    "",    ""}));
        for (String key : basicConf.keySet()) {
            String text=key+": "+basicConf.get(key).get(0) + " " + basicConf.get(key).get(1)+" "+basicConf.get(key).get(2)+" "+basicConf.get(key).get(3);
            System.out.println(text);
        }

    }
}
