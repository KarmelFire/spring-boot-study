package top.karmel.springboot.quickstart.test1;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author BC
 * @Date 2024/9/7 15:29
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Object obj = "Hello, Java 17!";

        // 旧的方式：先检查类型，再进行强制类型转换
        if (obj instanceof String) {
            String str = (String) obj;  // 显式类型转换
            System.out.println("Old way: " + str.toUpperCase());
        }

        // Java 17 新特性：模式匹配 for instanceof
        if (obj instanceof String str) {  // 模式匹配，直接将 obj 赋值为 String 类型
            System.out.println("New way: " + str.toUpperCase());
        }
    }
}

