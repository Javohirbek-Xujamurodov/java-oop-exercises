package danielLiangExercises.ex9_6;

public class StopWatch {
    long startTime;
    long endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.endTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


}
