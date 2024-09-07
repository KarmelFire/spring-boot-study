package top.karmel.springboot.quickstart.test1;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author BC
 * @Date 2024/9/7 15:23
 * @Version 1.0
 */
// Circle 继承自 Shape
final class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

