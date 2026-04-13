
public class Week4_7 {
    public static void main(String[] args) {
        int hang,lie,kong;
        for(hang=4;hang>=0;hang--){
                for(lie=0;lie<=hang;lie++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(hang=4;hang>=0;hang--){
            for(kong=1;kong<=(4-hang);kong++)
                System.out.printf(" ");
                for(lie=1;lie<=hang*2-1;lie++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(hang=4;hang>=0;hang--){
            for(kong=1;kong<=(4-hang);kong++)
                System.out.printf(" ");
                for(lie=1;lie<=hang;lie++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}


