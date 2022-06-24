import java.util.Scanner;

public class swap2numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Second number : ");
        int n2 = scan.nextInt();

        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After Swapping \n first number is : " + n1 + "\nSecond number is : " + n2);

    }
}
