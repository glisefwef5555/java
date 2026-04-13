import java.util.Scanner;

public class Week3_1 {
    public static void main(String[] args) {
        double breakfast, lunch, dinner;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 食堂当日消费 ===");
        System.out.print("请输入早餐消费金额（元）：");
        breakfast = scanner.nextDouble();
        System.out.print("请输入午餐消费金额（元）：");
        lunch = scanner.nextDouble();
        System.out.print("请输入晚餐消费金额（元）：");
        dinner = scanner.nextDouble();
        System.out.println("\n=== 当日总消费 ===");
        System.out.println("早餐：" + breakfast+"元");
        System.out.println("午餐：" + lunch+"元");
        System.out.println("晚餐：" + dinner+"元");
        System.out.printf("当日总消费：%.2f元\n", breakfast + lunch + dinner);
        System.out.printf("当日平均消费：%.2f元", (breakfast + lunch + dinner) / 3);
        scanner.close();
    }
}   