package top.karmel.springboot.quickstart.test1;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author BC
 * @Date 2024/9/7 15:23
 * @Version 1.0
 */
// Rectangle 继承自 Shape
final class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

