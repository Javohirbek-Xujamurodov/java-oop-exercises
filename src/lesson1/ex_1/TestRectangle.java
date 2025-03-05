package lesson1.ex_1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("\nRectangle 1:");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Hight: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimetr: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Hight: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimetr: " + rectangle2.getPerimeter());
    }
}
