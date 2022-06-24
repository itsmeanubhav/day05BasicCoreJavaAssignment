import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ip = scan.nextInt();

        String evenOdd = (ip % 2 == 0) ? "even" : "odd";
        System.out.println("Given input : " + ip + " is : " + evenOdd);
    }
}
