import java.util.Scanner;   
public class Week4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入新员工的姓名：");
        String name = in.nextLine();
        System.out.println("请输入新员工的语言：");
        String language = in.nextLine();
        switch (language) {
            case "Java":
                System.out.println(name + "的语言是Java");
                break;
            case "Python":
                System.out.println(name + "的语言是Python");
                break;
            case "C++":
                System.out.println(name + "的语言是C++");
                break;
            case "前端":
                System.out.println(name + "的语言是前端");
                break;
            default:
                System.out.println("输入的语言不合法");
                break;
        
        }
        in.close();
    }
    
}
