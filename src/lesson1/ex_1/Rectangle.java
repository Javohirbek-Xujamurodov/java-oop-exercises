package lesson1.ex_1;

public class Rectangle {
    double width;
    double  height;

    Rectangle(){
        width = 1;
        height = 1;
    }

    Rectangle(double w , double h) {
        this.width = w;
        this.height = h;
    }

    double  getArea(){
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width * height);
    }
}
