package danielLiangExercises.ex9_3;

public class Date {
    long elapsedTime;

    public Date() {
        elapsedTime = System.currentTimeMillis();
    }

    public Date(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public void setTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public long getTime() {
        return elapsedTime;
    }

    @Override
    public String toString() {
        return "Elapsed time: " + elapsedTime;
    }
}
