import java.util.Scanner;

public class largestAmong3 {
    public static void main(String[] args) {
        System.out.println("Program to find largest among 3 numbers");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First number");
        int ip1 = scan.nextInt();

        System.out.println("Enter the Second number");
        int ip2 = scan.nextInt();

        System.out.println("Enter the Third number");
        int ip3 = scan.nextInt();
        int greatest = 0;
        for(int i=0; i < 3 ; i++){
            if((ip1 > ip2) && (ip1 > ip3)){
                greatest = ip1;
            }else if(ip2 > ip3){
               greatest = ip2;
            }else{
                greatest = ip3;
            }
        }
        System.out.println(greatest + " is greatest among the 3 numbers ");
    }
}
