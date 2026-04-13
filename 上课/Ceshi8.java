import java.util.Scanner;
public class Ceshi8 {
    double a;//本子价格
    double b;//方便面价格
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本子价格: ");
        double a = scanner.nextDouble();
        System.out.print("请输入方便面价格: ");
        double b = scanner.nextDouble();
        double c = a + b;
        System.out.println("a + b = " +(int)c);
        scanner.close();
    }
}
