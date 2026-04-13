import java.util.Scanner;
public class Week4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fen = in.nextDouble();
        if(fen<=100 && fen>=0) {
            switch ((int)fen/10) {
                case 10:
                case 9:
                    System.out.println("成绩等级为：优秀");
                    break;
                case 8:
                    System.out.println("成绩等级为：良好");
                    break;
                default:
                    System.out.println("成绩等级为：不及格");
            }
        } else {
            System.out.println("成绩不合法");
        }
        in.close();
    }
}