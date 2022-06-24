import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ip = scan.nextInt();

        if(ip >= 1000 && ip <= 9999){
            if( ( ((ip % 4) == 0) && ((ip % 400) == 0) ) || (ip % 100 != 0)){
                System.out.println("Year is leap Year");
            }else{
                System.out.println("Year is not a leap year");
            }
        }else{
            System.out.println("Enter Valid Number");
        }
    }
}
