import java.util.Scanner;

public class Week3_2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("输入一个数：");
       int num = scanner.nextInt();
         if (num>100 && num<1000) {
                int a = num / 100;
                int b = (num % 100) / 10;
                int c = num % 10;
                if (num == a * a * a + b * b * b + c * c * c) {
                    System.out.println(num + "是一个水仙花数");
                } else {
                    System.out.println(num + "不是一个水仙花数");
                }
            } else {
                System.out.println("请输入一个三位数！");
            scanner.close();
         }
    }
}
