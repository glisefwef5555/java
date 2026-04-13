import java.util.Scanner;
public class Ceshi7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;//年龄
        String name;
        int y;//班级
        System.out.println("请输入你的名字：");
        name = scanner.next();
        System.out.println("请输入你的年龄：");
        x = scanner.nextInt();
        System.out.println("请输入你的班级：");
        y = scanner.nextInt();
        System.out.println("你的名字是：" + name);
        System.out.println("你的年龄是：" + x);
        System.out.println("你的班级是：" + y);
        scanner.close();
    }
}
