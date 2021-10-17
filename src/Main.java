import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rdNumber = random.nextInt(10);
        System.out.println(rdNumber);

//        1, Viết chương trình sinh 1 số ngẫu nhiên, kiểm tra số đó là chẵn hay lẻ, sử dụng toán tử ba ngôi
//        Kiem tra chan le
//        Kết quả phép toán bit AND giữa số lẻ với số 1 luôn bằng 1
        String OddOrEven = (rdNumber & 1) == 1 ? "Day la so le" : "Day la so chan";
        System.out.println(OddOrEven);

//        2,Tính cạnh huyền của tam giác vuông khi biết:
//        a = 3
//        b = 4
//        c = ?
        int a = 3, b = 4;
        float c = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Canh huyen la %f", c);

//        3, Viết chương trình, nhập hai số nguyên x và y, viết phương thức thực hiện các phép tính toàn với 2 số nguyên đó gồm:
//
//        x + y
//        x - y
//        x * y
//        x/y

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap x: ");
        int x = sc.nextInt();
        System.out.print("\nNhap y: ");
        int y = sc.nextInt();
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + ((double)x / y));

    }
}
