package AID.io.Seed.linux;

import AID.io.IOOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/16/15.
 */
public class BasicLinuxEN_Config {
    static HashMap<String, List<String>> basicConf = new HashMap<String, List<String>>();


    public static HashMap<String, List<String>> fillinBasicConf(HashMap<String, List<String>> sysConf) {
        basicConf.put("AID_online", Arrays.asList(new String[]{"main", "AID come back", "I am online and ready!", ""}));
        basicConf.put("AID_offline", Arrays.asList(new String[]{"main", "AID off transmitter", "All advanced regognition functions stoped!", ""}));
        basicConf.put("AID_close", Arrays.asList(new String[]{"main", "Close aid system", "You are sure?", ""}));
        basicConf.put("yes", Arrays.asList(new String[]{"main", "Yes", "", ""}));
        basicConf.put("no", Arrays.asList(new String[]{"main", "No", "", ""}));

        basicConf.put("enable_music", Arrays.asList(new String[]{"control", "Enable music control", "", ""}));
        basicConf.put("disable_music", Arrays.asList(new String[]{"control", "Disable music control", "", ""}));
        basicConf.put("enable_mouse", Arrays.asList(new String[]{"control", "Enable mouse control", "", ""}));
        basicConf.put("disable_mouse", Arrays.asList(new String[]{"control", "Disable mouse control", "", ""}));
        basicConf.put("enable_video", Arrays.asList(new String[]{"control", "Enable video control", "", ""}));
        basicConf.put("disable_video", Arrays.asList(new String[]{"control", "Disable video control", "", ""}));
        basicConf.put("enable_internet", Arrays.asList(new String[]{"control", "Enable internet control", "", ""}));
        basicConf.put("disable_internet", Arrays.asList(new String[]{"control", "Disable internet control", "", ""}));
        basicConf.put("enable_skype", Arrays.asList(new String[]{"control", "Enable skype control", "", ""}));
        basicConf.put("disable_skype", Arrays.asList(new String[]{"control", "Disable skype control", "", ""}));

        basicConf.put("show_music_player", Arrays.asList(new String[]{"music", "Show music player", "", sysConf.get("defaultMusicPlayer").get(0).toString()}));
        basicConf.put("play_music", Arrays.asList(new String[]{"music", "Play music", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --play"}));
        basicConf.put("stop_music", Arrays.asList(new String[]{"music", "Stop music", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --pause"}));
        basicConf.put("pause_music", Arrays.asList(new String[]{"music", "Pause music", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --pause"}));
        basicConf.put("next_music", Arrays.asList(new String[]{"music", "Next music", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --next"}));
        basicConf.put("prev_music", Arrays.asList(new String[]{"music", "Music back", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --previous"}));
        basicConf.put("close_player", Arrays.asList(new String[]{"music", "Close music player", "", "killall " + sysConf.get("defaultMusicPlayer").get(0).toString()}));

        basicConf.put("volume0", Arrays.asList(new String[]{"volume", "Volume zero", "", "amixer set Master 0"}));
        basicConf.put("volume50%", Arrays.asList(new String[]{"volume", "Half volume", "", "amixer set Master 50"}));
        basicConf.put("volume100%", Arrays.asList(new String[]{"volume", "Volume max", "", "amixer set Master 100"}));
        basicConf.put("volume_off", Arrays.asList(new String[]{"volume", "Volume mute", "", "amixer set Master mute"}));
        basicConf.put("volume_on", Arrays.asList(new String[]{"volume", "Volume mute off", "", "amixer set Master unmute"}));
        basicConf.put("volume+20", Arrays.asList(new String[]{"volume", "Volume up", "", "amixer set Master 20+"}));
        basicConf.put("volume-20", Arrays.asList(new String[]{"volume", "Volume down", "", "amixer set Master 20-"}));

        basicConf.put("030", Arrays.asList(new String[]{"video", "Show video player", "", sysConf.get("defaultVideoPlayer").get(0).toString()}));
        basicConf.put("031", Arrays.asList(new String[]{"video", "Play video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --play"}));
        basicConf.put("032", Arrays.asList(new String[]{"video", "Video stop", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --pause"}));
        basicConf.put("033", Arrays.asList(new String[]{"video", "pause Video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --pause"}));
        basicConf.put("034", Arrays.asList(new String[]{"video", "Next video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --next"}));
        basicConf.put("035", Arrays.asList(new String[]{"video", "Previous video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --previous"}));
        basicConf.put("036", Arrays.asList(new String[]{"video", "Forward video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --seek-fwd"}));
        basicConf.put("037", Arrays.asList(new String[]{"video", "Back video", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --seek-bwd"}));
        basicConf.put("038", Arrays.asList(new String[]{"video", "Totem volume up", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --volume-up"}));
        basicConf.put("039", Arrays.asList(new String[]{"video", "Totem volume down", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --volume-down"}));
        basicConf.put("040", Arrays.asList(new String[]{"video", "Close totem", "", "killall " + sysConf.get("defaultVideoPlayer").get(0).toString()}));

        basicConf.put("041", Arrays.asList(new String[]{"mouse", "Left click", "", ""}));
        basicConf.put("042", Arrays.asList(new String[]{"mouse", "Right click", "", ""}));
        basicConf.put("043", Arrays.asList(new String[]{"mouse", "Middle click", "", ""}));
        basicConf.put("044", Arrays.asList(new String[]{"mouse", "Set position", "", ""}));
        basicConf.put("045", Arrays.asList(new String[]{"mouse", "Set one", "", ""}));
        basicConf.put("046", Arrays.asList(new String[]{"mouse", "Set two", "", ""}));
        basicConf.put("047", Arrays.asList(new String[]{"mouse", "Set three", "", ""}));
        basicConf.put("048", Arrays.asList(new String[]{"mouse", "Set four", "", ""}));
        basicConf.put("049", Arrays.asList(new String[]{"mouse", "Set five", "", ""}));
        basicConf.put("050", Arrays.asList(new String[]{"mouse", "Set six", "", ""}));
        basicConf.put("051", Arrays.asList(new String[]{"mouse", "Set seven", "", ""}));
        basicConf.put("052", Arrays.asList(new String[]{"mouse", "Set eight", "", ""}));
        basicConf.put("053", Arrays.asList(new String[]{"mouse", "Set nine", "", ""}));

        basicConf.put("054", Arrays.asList(new String[]{"oher", "Open browser", "", "x-www-browser"}));
        basicConf.put("055", Arrays.asList(new String[]{"oher", "Open face book page", "", "xdg-open http://facebook.com"}));
        basicConf.put("056", Arrays.asList(new String[]{"oher", "Close browser", "", "killall " + sysConf.get("defaultBrowser").get(0).toString()}));
        basicConf.put("057", Arrays.asList(new String[]{"oher", "Open music folder", "", "xdg-open ~/Music"}));
        basicConf.put("058", Arrays.asList(new String[]{"oher", "Open video folder", "", "xdg-open ~/Videos"}));
        basicConf.put("059", Arrays.asList(new String[]{"oher", "Open home folder", "", "xdg-open ~/"}));

        basicConf.put("060", Arrays.asList(new String[]{"oher", "Call to mother", "", "skype --callto gazduny"}));

        basicConf.put("page_up", Arrays.asList(new String[]{"keyboard", "Page up", "", ""}));
        basicConf.put("pahe_down", Arrays.asList(new String[]{"keyboard", "Page down", "", ""}));
        basicConf.put("next_tab", Arrays.asList(new String[]{"keyboard", "Next tab", "", ""}));
        basicConf.put("relad_page", Arrays.asList(new String[]{"keyboard", "Reload page", "", ""}));

//        basicConf.put("0", Arrays.asList(new String[]{"keyboard",   "",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));

        basicConf.put("show_tree", Arrays.asList(new String[]{"oher", "Show command tree", "", ""}));
        basicConf.put("close_tree", Arrays.asList(new String[]{"oher", "Close command tree", "", ""}));
//        for (String key : basicConf.keySet()) {
//            String text = key + ": " + basicConf.get(key).get(0) + " " + basicConf.get(key).get(1) + " " + basicConf.get(key).get(2) + " " + basicConf.get(key).get(3);
//            System.out.println(text);
//        }
        return basicConf;
    }
}
