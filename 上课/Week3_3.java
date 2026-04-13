import java.util.Scanner;
public class Week3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查询余额请按1，查询流量请按2，人工服务请按3，挂机请按#");
        char choice = scanner.next().charAt(0);
        if(choice == '1') {
            System.out.println("您的余额为：100元");
        } else if(choice == '2') {
            System.out.println("您的流量剩余：500MB");
        } else if(choice == '3') {
            System.out.println("正在为您转接人工服务...");
        } else if(choice == '#') {
            System.out.println("感谢您的使用，再见！");
        } else {
            System.out.println("无效的输入，请重新选择！");
        }
        scanner.close();
      
    }
}
