package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Time {
    public void LocalTime() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Local time: " + df.format(date));
    }

    public void GlobalTime(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ssXXX");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("Global time: " + df.format(date));
    }
}
