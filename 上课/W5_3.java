import java.util.Scanner;
import java.util.Random;
public class W5_3 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   
        System.out.println("请输入一个1000以内的整数：");
        int n = in.nextInt();
        if(n < 1 || n > 1000){
            System.out.println("输入的数不合法，请重新输入：");
            n = in.nextInt();
        }
        Random suiji = new Random();
            int pc = suiji.nextInt(1000) + 1;
            while (true) {
                if (n > pc) {
                    System.out.println("你猜的数太大了，请重新输入：");
                    n = in.nextInt();
                } else if (n < pc) {
                    System.out.println("你猜的数太小了，请重新输入：");
                    n = in.nextInt();
                } else {
                    System.out.println("恭喜你，猜对了！");
                    break;
                }
            }
            in.close();
    }
}
