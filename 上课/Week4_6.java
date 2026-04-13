import java.util.Random;
import java.util.Scanner;

public class Week4_6 {
    public static void main(String[] args) {
        int player;
        int pc;
        int a=0;
        Random suiji = new Random();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.println("石头---1   剪刀---2   布---3");
        pc = suiji.nextInt(3) + 1;
        System.out.println("请输入你的选择：");
        player = in.nextInt();
            if (player == pc) {
                a=a+0;
                System.out.println("平局");
            } else if ((player == 1 && pc == 2) || (player == 2 && pc == 3) || (player == 3 && pc == 1)) {
                a++;
                System.out.println("你赢了");
            } else {
                a--;
                System.out.println("你输了");
            }
    }
    if(a==0){
            System.out.print("平局");
        }else if(a>0){
            System.out.print("player获胜");
        }else{
            System.out.print("pc获胜");
        }
        in.close();
    }
}
