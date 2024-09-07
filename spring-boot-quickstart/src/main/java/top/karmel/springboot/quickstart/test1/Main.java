package top.karmel.springboot.quickstart.test1;

/**
 * @ClassName Main
 * @Description TODO
 * @Author BC
 * @Date 2024/9/7 15:23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);   // 创建一个 Circle 对象
        Shape shape2 = new Rectangle(4, 6);  // 创建一个 Rectangle 对象

        // 判断类型并输出面积
        if (shape1 instanceof Circle) {
            System.out.println("Circle area: " + ((Circle) shape1).area());
        }
        if (shape2 instanceof Rectangle) {
            System.out.println("Rectangle area: " + ((Rectangle) shape2).area());
        }
    }
}
