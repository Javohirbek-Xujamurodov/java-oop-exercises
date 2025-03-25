package danielLiangExercises.ex9_3;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();

        long[] times = {10000, 100000, 1000000, 10000000, 100000000, 1000000000L, 10000000000L, 100000000000L};

        for (long time : times) {
            d.setTime(time);
            System.out.println("Elapsed time " + time + " -> " + d.getTime());        }
    }
}
