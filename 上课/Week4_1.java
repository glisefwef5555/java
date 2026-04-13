import java.util.Scanner;
public class Week4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String xingming;
        String zhuanye;
        int fenshu;
        double jidian;

        System.out.println("=== 大学生奖学金评定系统 ===");
        System.out.print("请输入你的姓名：");
        xingming = in.next();
        System.out.print("请输入你的专业：");
        zhuanye = in.next();
        System.out.print("请输入本学期绩点(GPA)：");
        jidian = in.nextDouble();
        System.out.print("请输入综合测评分数（满分100）：");
        fenshu = in.nextInt();

        double jichu = jidian * 200;
        double zonghe = fenshu * 5;
        double zongji = jichu + zonghe;

        System.out.println("");
        System.out.println("=== 奖学金测评结果 ===");
        System.out.println("学生姓名：" + xingming);           
        System.out.println("所属专业：" + zhuanye);
        System.out.println("本学期绩点：" + jidian);
        System.out.println("综合测评分数：" + fenshu);
        System.out.println("-----------------------------");
        System.out.printf("基础奖学金（GPA*200）: %.2f元%n", jichu);
        System.out.printf("综合测评加分（分数*5）: %.2f元%n", zonghe);
        System.out.printf("最终奖学金总额: %.2f元%n", zongji);
        in.close();
    }
}
