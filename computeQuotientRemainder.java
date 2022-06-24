import java.util.Scanner;

public class computeQuotientRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter dividend");
        int dividend = scan.nextInt();
        System.out.println("Please enter divisor");
        int divisor = scan.nextInt();

        int remainder = dividend % divisor;
        int quotient = dividend / divisor;

        System.out.println("After dividing : "+ dividend + " with : "+ divisor + " we are getting these values:  " +
                "\n Remainder : " + remainder + "\n and \n" + "Quotient : "+ quotient );

    }
}
