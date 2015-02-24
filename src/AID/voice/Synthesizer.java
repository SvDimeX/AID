package AID.voice;

import AID.io.IOCommand;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by dima-sv on 2/3/15.
 */
public class Synthesizer {
    private static final String VOICE_NAME = "kevin16";
    private static VoiceManager voiceManager = VoiceManager.getInstance();
    private static Voice voice;

    public static void speak(String textTS) {
        IOCommand run = new IOCommand();
//        run.runCommand("amixer set Capture toggle");
//        run.runCommand("amixer -c 1 sset Mic toggle"); //потрібно тільки для вбудованого мікрофону
        voice = voiceManager.getVoice(VOICE_NAME);
        voice.allocate();
        voice.speak(textTS);
        voice.deallocate();
//        run.runCommand("amixer set Capture toggle");
//        run.runCommand("amixer -c 1 sset Mic toggle");
    }
}
