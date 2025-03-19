package danielLiangExercises.ex10_1;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Current time: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println("Time(555550000): " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());

        Time time3 = new Time(5, 23, 55);
        System.out.println("Time(5, 23, 55): " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}

