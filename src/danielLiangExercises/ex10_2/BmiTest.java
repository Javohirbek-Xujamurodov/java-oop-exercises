package danielLiangExercises.ex10_2;

public class BmiTest {
    public static void main(String[] args) {
        BMI person1 = new BMI("John", 25, 70, 1.75);
        System.out.println(person1.getName() + " BMI: " + person1.getBMI() + " - " + person1.getStatus());

        BMI person2 = new BMI("Alice", 30, 60, 5, 4);
        System.out.println(person2.getName() + " BMI: " + person2.getBMI() + " - " + person2.getStatus());
    }
}
