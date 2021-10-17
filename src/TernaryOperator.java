import java.util.Scanner;

public class TernaryOperator {
    static void demo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ky: ");
        int n = sc.nextInt();

        String result = n % 2 == 0 ? n + "la so chan": n + " la so le";
        System.out.println(result);
    }
}
