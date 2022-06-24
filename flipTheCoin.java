import java.util.Scanner;

public class flipTheCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number Of Times To Flip Coin");
        int ip = scan.nextInt();
        double tails = 0;
        double heads = 0;
        if(ip > 0){
            for(int i = 0; i < ip ; i++){
                double rdom = Math.random();
                //System.out.println(rdom);
                if(rdom > 0.5){
                    tails++;
                }else{
                    heads++;
                }
            }
        }
        System.out.println(tails);
        System.out.println(heads);
        double tailsOutCome = (tails/ip)* 100;
        double headsOutCome = (heads/ip)* 100;

        System.out.println("Percentage Of Heads " + headsOutCome);
        System.out.println("Percentage Of tails " + tailsOutCome);
    }
}
