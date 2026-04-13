import java.util.Scanner;
public class Week4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a={"january","february","march","april","may","june","july","august","september","october","november","december"};
        System.out.println("请输入月份：" );
        int n = in.nextInt();
        if(n>0&&n<13){
            switch (n) {
                case 2,3,4:
                    System.out.println(a[n-1]+"是春季");
                    break;
                case 5,6,7:
                    System.out.println(a[n-1]+"是夏季");
                    break;
                case 8,9,10:
                    System.out.println(a[n-1]+"是秋季");
                    break;
                case 11,12,1:
                    System.out.println(a[n-1]+"是冬季");
                    break;
            }
        }
        else {
            System.out.println("输入的月份不合法");
        }
        in.close();
    }
}
