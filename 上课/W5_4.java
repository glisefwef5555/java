import java.util.Scanner;
public class W5_4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int n = 0;
        System.out.println("请输入10个整数：");
        Scanner in  = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i] = in.nextInt();
            n++;
            if(a[i]==666){
                System.out.println("输入666，被迫退出");
                break;
            }
        }
        System.out.println("输入了" + n + "个整数");
        in.close();
    }
}
