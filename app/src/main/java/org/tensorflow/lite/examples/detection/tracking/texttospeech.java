package org.tensorflow.lite.examples.detection.tracking;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.Locale;

public class texttospeech {
    public static TextToSpeech mTTS;



    public static void speak(String text) {




        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }



}
