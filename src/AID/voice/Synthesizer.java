package AID.voice;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by dima-sv on 2/3/15.
 */
public class Synthesizer {
    private static final String VOICE_NAME = "kevin16";
    private static VoiceManager voiceManager = VoiceManager.getInstance();
    private static Voice voice;

    public static void speak(String textTS){
        voice = voiceManager.getVoice(VOICE_NAME);
        voice.allocate();
        voice.speak(textTS);
        voice.deallocate();
    }
}
