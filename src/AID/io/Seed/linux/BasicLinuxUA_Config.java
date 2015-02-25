package AID.io.Seed.linux;

import AID.io.IOOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/16/15.
 */
public class BasicLinuxUA_Config {
    static HashMap<String, List<String>> basicConf = new HashMap<String, List<String>>();

    public static HashMap<String, List<String>> fillinBasicConf(HashMap<String, List<String>> sysConf) {
        basicConf.put("AID_online", Arrays.asList(new String[]{"main", "АІД повернися", "I am online and ready!", ""}));
        basicConf.put("AID_offline", Arrays.asList(new String[]{"main", "АІД виключи передавач", "All advanced regognition functions stoped!", ""}));
        basicConf.put("AID_close", Arrays.asList(new String[]{"main", "Закрити систему АІД", "You are sure?", ""}));
        basicConf.put("yes", Arrays.asList(new String[]{"main", "Так", "", ""}));
        basicConf.put("no", Arrays.asList(new String[]{"main", "Ні", "", ""}));

        basicConf.put("enable_music", Arrays.asList(new String[]{"control", "Встановити контроль музикою", "", ""}));
        basicConf.put("disable_music", Arrays.asList(new String[]{"control", "Закрити контроль музикою", "", ""}));
        basicConf.put("enable_mouse", Arrays.asList(new String[]{"control", "Встановити контроль над мишкою", "", ""}));
        basicConf.put("disable_mouse", Arrays.asList(new String[]{"control", "Закрити контроль над мишкою", "", ""}));
        basicConf.put("enable_video", Arrays.asList(new String[]{"control", "Встановити контроль над відео", "", ""}));
        basicConf.put("disable_video", Arrays.asList(new String[]{"control", "Закрити контроль над відео", "", ""}));
        basicConf.put("enable_internet", Arrays.asList(new String[]{"control", "Встановити контроль над інтернетом", "", ""}));
        basicConf.put("disable_internet", Arrays.asList(new String[]{"control", "Закрити контроль над інтернетом", "", ""}));
        basicConf.put("enable_skype", Arrays.asList(new String[]{"control", "Встановити контроль над скайпом", "", ""}));
        basicConf.put("disable_skype", Arrays.asList(new String[]{"control", "Закрити контроль над скайпом", "", ""}));

        basicConf.put("show_music_player", Arrays.asList(new String[]{"music", "Запустити музичний плеєр", "", sysConf.get("defaultMusicPlayer").get(0).toString()}));
        basicConf.put("play_music", Arrays.asList(new String[]{"music", "Грати музику", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --play"}));
        basicConf.put("stop_music", Arrays.asList(new String[]{"music", "Музика стоп", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --pause"}));
        basicConf.put("pause_music", Arrays.asList(new String[]{"music", "Музика пауза", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --pause"}));
        basicConf.put("next_music", Arrays.asList(new String[]{"music", "Наступна пісня", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --next"}));
        basicConf.put("prev_music", Arrays.asList(new String[]{"music", "Попередня пісня", "", sysConf.get("defaultMusicPlayer").get(0).toString() + " --previous"}));
        basicConf.put("close_player", Arrays.asList(new String[]{"music", "Закрити музичний плеєр", "", "killall " + sysConf.get("defaultMusicPlayer").get(0).toString()}));

        basicConf.put("volume0", Arrays.asList(new String[]{"volume", "Мінімальна гучність", "", "amixer set Master 0"}));
        basicConf.put("volume50%", Arrays.asList(new String[]{"volume", "Половину гучності", "", "amixer set Master 50"}));
        basicConf.put("volume100%", Arrays.asList(new String[]{"volume", "Максимальна гучність", "", "amixer set Master 100"}));
        basicConf.put("volume_off", Arrays.asList(new String[]{"volume", "Виключити звук", "", "amixer set Master mute"}));
        basicConf.put("volume_on", Arrays.asList(new String[]{"volume", "Включити звук", "", "amixer set Master unmute"}));
        basicConf.put("volume+20", Arrays.asList(new String[]{"volume", "Звук голосніше", "", "amixer set Master 20+"}));
        basicConf.put("volume-20", Arrays.asList(new String[]{"volume", "звук тихіше", "", "amixer set Master 20-"}));

        basicConf.put("030", Arrays.asList(new String[]{"video", "Запустити відео плеєр", "", sysConf.get("defaultVideoPlayer").get(0).toString()}));
        basicConf.put("031", Arrays.asList(new String[]{"video", "Запустити відео", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --play"}));
        basicConf.put("032", Arrays.asList(new String[]{"video", "Відео стоп", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --pause"}));
        basicConf.put("033", Arrays.asList(new String[]{"video", "Відео пауза", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --pause"}));
        basicConf.put("034", Arrays.asList(new String[]{"video", "Наступне відео", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --next"}));
        basicConf.put("035", Arrays.asList(new String[]{"video", "Попереднє відео", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --previous"}));
        basicConf.put("036", Arrays.asList(new String[]{"video", "Перемотати вперед", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --seek-fwd"}));
        basicConf.put("037", Arrays.asList(new String[]{"video", "Перемотати назад", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --seek-bwd"}));
        basicConf.put("038", Arrays.asList(new String[]{"video", "Відео плеєр голосніше", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --volume-up"}));
        basicConf.put("039", Arrays.asList(new String[]{"video", "Відео плеєр тихіше", "", sysConf.get("defaultVideoPlayer").get(0).toString() + " --volume-down"}));
        basicConf.put("040", Arrays.asList(new String[]{"video", "Закрити відео плеєр", "", "killall " + sysConf.get("defaultVideoPlayer").get(0).toString()}));

        basicConf.put("041", Arrays.asList(new String[]{"mouse", "Лівий клік", "", ""}));
        basicConf.put("042", Arrays.asList(new String[]{"mouse", "Правий клік", "", ""}));
        basicConf.put("043", Arrays.asList(new String[]{"mouse", "Середній клік", "", ""}));
        basicConf.put("044", Arrays.asList(new String[]{"mouse", "Встановити позицію", "", ""}));
        basicConf.put("045", Arrays.asList(new String[]{"mouse", "Сектор один", "", ""}));
        basicConf.put("046", Arrays.asList(new String[]{"mouse", "Сектор два", "", ""}));
        basicConf.put("047", Arrays.asList(new String[]{"mouse", "Сектор три", "", ""}));
        basicConf.put("048", Arrays.asList(new String[]{"mouse", "Сектор чотири", "", ""}));
        basicConf.put("049", Arrays.asList(new String[]{"mouse", "Сектор пять", "", ""}));
        basicConf.put("050", Arrays.asList(new String[]{"mouse", "Сектор шість", "", ""}));
        basicConf.put("051", Arrays.asList(new String[]{"mouse", "Сектор сім", "", ""}));
        basicConf.put("052", Arrays.asList(new String[]{"mouse", "Сектор вісім", "", ""}));
        basicConf.put("053", Arrays.asList(new String[]{"mouse", "Сектор девять", "", ""}));

        basicConf.put("054", Arrays.asList(new String[]{"oher", "Відкрити браузер", "", "x-www-browser"}));
        basicConf.put("055", Arrays.asList(new String[]{"oher", "Відкрити фейсбук", "", "xdg-open http://facebook.com"}));
        basicConf.put("056", Arrays.asList(new String[]{"oher", "Закрити браузер", "", "killall " + sysConf.get("defaultBrowser").get(0).toString()}));
        basicConf.put("057", Arrays.asList(new String[]{"oher", "Відкрити папку з музикою", "", "xdg-open ~/Music"}));
        basicConf.put("058", Arrays.asList(new String[]{"oher", "Відкрити папку з відео", "", "xdg-open ~/Videos"}));
        basicConf.put("059", Arrays.asList(new String[]{"oher", "Відкрити домашню папку", "", "xdg-open ~/"}));

        basicConf.put("060", Arrays.asList(new String[]{"oher", "Зателефонувати до мами", "", "skype --callto gazduny"}));

        basicConf.put("page_up", Arrays.asList(new String[]{"keyboard", "Попередня сторінка", "", ""}));
        basicConf.put("pahe_down", Arrays.asList(new String[]{"keyboard", "Наступна сторінка", "", ""}));
        basicConf.put("next_tab", Arrays.asList(new String[]{"keyboard", "Наступна вкладка", "", ""}));
        basicConf.put("relad_page", Arrays.asList(new String[]{"keyboard", "Перезавантажити сторінку", "", ""}));

//        basicConf.put("0", Arrays.asList(new String[]{"keyboard",   "",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));
//        basicConf.put("0", Arrays.asList(new String[]{"",    "",    ""}));

        basicConf.put("show_tree", Arrays.asList(new String[]{"oher", "Показати дерево команд", "", ""}));
        basicConf.put("close_tree", Arrays.asList(new String[]{"oher", "Закрити дерево команд", "", ""}));
        for (String key : basicConf.keySet()) {
            String text = key + ": " + basicConf.get(key).get(0) + " " + basicConf.get(key).get(1) + " " + basicConf.get(key).get(2) + " " + basicConf.get(key).get(3);
            System.out.println(text);
        }
        return basicConf;
    }
}
