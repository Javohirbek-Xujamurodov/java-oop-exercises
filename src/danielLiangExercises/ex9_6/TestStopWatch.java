package danielLiangExercises.ex9_6;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        stopwatch.stop();

        System.out.println("Saralashga ketgan vaqt: " + stopwatch.getElapsedTime() + " ms");
    }
}
