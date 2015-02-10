package AID.function;

import AID.voice.Synthesizer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dima-sv on 2/9/15.
 */
public class CustomFunction {
    public static String getTime(){
        DateFormat hours = new SimpleDateFormat("HH");
        DateFormat minutes = new SimpleDateFormat("mm");

        Date date = new Date();
        String answer;
        answer= hours.format(date).toString() + " hours and " + minutes.format(date) + " minutes.";
        return answer;
    }

    public static String getDate(){
        DateFormat year = new SimpleDateFormat("yyyy");
        DateFormat month = new SimpleDateFormat("MM");
        DateFormat day = new SimpleDateFormat("dd");
        Date date = new Date();
        String answer;
        //TODO змінити назву місяця на словесну а не цифрову
        answer= day.format(date).toString() + " " + month.format(date) + " " + year.format(date).toString();
        return answer;
    }

}
