public class W5_5 {
    public static void main(String[] args) {
        int hang,lie,kong;
        for(hang=1;hang<4;hang++){
                for(kong =3;kong>=hang;kong--){
                System.out.printf(" ");
                }
                for(lie=1;lie<=(2*hang-1);lie++){
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
    }
}

