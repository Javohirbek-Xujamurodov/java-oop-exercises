package lesson2.ex_3;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0.5f , 3.0f);
        System.out.println("Length " + rect.getLength());
        System.out.println("Width " + rect.getWidth());
        System.out.println("Area " + rect.getArea());
        System.out.println("Perimeter " + rect.getPerimeter());
System.out.println();
        rect.setWidth(6.5f);
        rect.setLength(6.5f);

        System.out.println("Length " + rect.getLength());
        System.out.println("Width " + rect.getWidth());
        System.out.println("Area " + rect.getArea());
        System.out.println("Perimeter " + rect.getPerimeter());
    }
}
