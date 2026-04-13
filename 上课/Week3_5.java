import java.util.Scanner;

public class Week3_5 {
    public static void main(String[] args) {
        String name, major, course;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 大学生课表信息录入 ===");
        System.out.print("请输入你的姓名：");
        name = scanner.nextLine();
        System.out.print("请输入你的专业：");
        major = scanner.nextLine();
        System.out.print("请输入本学期核心课程名称：");
        course = scanner.nextLine();
        System.out.print("请输入该课程学分：");
        num = scanner.nextInt();
        System.out.println("\n=== 你的课表信息 ===");
        System.out.println("姓名：" + name);
        System.out.println("专业：" + major);
        System.out.printf("核心课程：%s(学分：%d)", course, num);
        scanner.close();
    }
}   