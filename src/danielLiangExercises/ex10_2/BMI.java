package danielLiangExercises.ex10_2;
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;


    public BMI() {
    }


    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = (feet * 0.3048) + (inches * 0.0254);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public double getBMI() {
        return weight / (height * height);
    }


    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        BMI person1 = new BMI("John", 25, 70, 1.75);
        System.out.println(person1.name + " BMI: " + person1.getBMI() + " - " + person1.getStatus());


        BMI person2 = new BMI("Alice", 30, 60, 5, 4);
        System.out.println(person2.name + " BMI: " + person2.getBMI() + " - " + person2.getStatus());
    }
}
