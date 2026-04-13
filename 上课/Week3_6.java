import java.util.Scanner;

public class Week3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一条边a：");
        int a = scanner.nextInt();
        System.out.print("请输入第二条边b：");
        int b = scanner.nextInt();
        System.out.print("请输入第三条边c：");
        int c = scanner.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a) && a > 0 && b > 0 && c > 0) {
            double p = (a + b + c) / 2.0;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            
            System.out.println("可以构成三角形");
            System.out.printf("三角形的面积为：%.2f\n", s); 
        } else {
            System.out.println("这三条边不能构成三角形！");
        }

        scanner.close();
    }
}