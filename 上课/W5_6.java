public class W5_6 {
    public static void main(String[] args) {
     int hang,lie;
        for(hang=1;hang<4;hang++){
                for(lie=0;lie<hang;lie++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(hang=3;hang>=0;hang--){
                for(lie=0;lie<=hang*2;lie++){
                System.out.printf("*");
            }
            System.out.println();
        }
}
}
