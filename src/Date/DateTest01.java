package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        Date nowTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = simpleDateFormat.format(nowTime);
        System.out.println(nowTimeStr);
        //String--->Date
        String time = "2023-06-21 12:22:33 444";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = simpleDateFormat1.parse(time);
        System.out.println(date);
    }
}
