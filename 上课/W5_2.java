import java.util.Random;
import java.util.Scanner;

public class W5_2 {
    public static void main(String[] args) {
        int player;
        int pc;
        int ping=0,win=0,lose=0;
        Random suiji = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入游戏轮数：");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("石头---1   剪刀---2   布---3");
        pc = suiji.nextInt(3) + 1;
        System.out.println("第" + (i + 1) + "轮，请输入你的选择：");
        player = in.nextInt();
            if (player == pc) {
                System.out.println("平局");
                ping++;
            } else if ((player == 1 && pc == 2) || (player == 2 && pc == 3) || (player == 3 && pc == 1)) {
                System.out.println("你赢了");
                win++;
            } else {
                System.out.println("你输了");
                lose++;
            }    
            System.out.println("是否继续游戏？结束请输入-1");
            int end = in.nextInt();
            if(end == -1){
                break;
            }
    }
    if(ping>win && ping>lose){
            System.out.print("平局了");
        }else if(win>lose){
            System.out.print("player获胜");/*  */
        }else{
            System.out.print("pc获胜");
        }
        in.close();
    }
}
