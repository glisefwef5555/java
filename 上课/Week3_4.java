/* 
    *字符串string是“eidafh”  字符‘a’ 
    *读取字符串的时候用.equals()方法比较字符串是否相等
    *读取字符的时候用.next().charAt(0)方法获取输入的第一个字符    charAt(0)括号里面表示第几个字符
*/
import java.util.Scanner;
public class Week3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查询余额请按1，查询流量请按2，人工服务请按3，挂机请按#");
        String num=scanner.next();
        if(num.equals("1")) {
            System.out.println("您的余额为：100元");
        } else if(num.equals("2")) {
            System.out.println("您的流量剩余：500MB");
        } else if(num.equals("3")) {
            System.out.println("正在为您转接人工服务...");
        } else if(num.equals("#")) {
            System.out.println("感谢您的使用，再见！");
        } else {
            System.out.println("无效的输入，请重新选择！");
        }
        scanner.close();
    }
}