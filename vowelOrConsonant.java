import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ip = scan.next().charAt(0);

        if( ip == 'a' || ip == 'e' || ip == 'i' || ip == 'o' || ip == 'u'){
            System.out.println(ip + " is vowel");
        }else{
            System.out.println(ip + " is consonant");
        }
    }
}
