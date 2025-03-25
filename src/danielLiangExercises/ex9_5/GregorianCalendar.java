package danielLiangExercises.ex9_5;

import java.util.Calendar;

public class GregorianCalendar {
    public static void main(String[] args) {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Hozirgi sana: " + year + "-" + month + "-" + day);


        calendar.setTimeInMillis(1234567898765L);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Sozlangan sana: " + year + "-" + month + "-" + day);
    }
}
