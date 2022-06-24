import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ip = scan.nextInt();
        int base = 2;
        int po2 = 1;
        if(ip > 0 && ip < 31){
            for(int i =0 ; i < ip; i++){
                po2 *= base;
            }

        }else{
            System.out.println("this value cant be 0 or more than 31 \n Please provide proper input");
        }
        System.out.println("for value : " + ip + " the power of 2 is : " + po2);
    }
}
