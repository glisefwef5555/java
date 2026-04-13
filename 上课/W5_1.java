public class W5_1 {
    public static void main(String[] args) {
        int count=1;
        for(;count<=10;count++){
            System.out.println("第" + count + "圈开始");
            if(count==5){
                System.out.println("摔倒了，被同学扶着走了");
                //结束这一圈；
                //continue;//继续
                //break;//结束循环
                return; //结束该方法  
         }
            System.out.println("第" + count + "圈结束");
        }
    }
}
