import java.util.Scanner;

public class DordunKatlarinToplami {
    public static void main(String[] args) {
        int total = 0, a;

        Scanner data = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz :");
            a = data.nextInt();
            if (a % 4 == 0) {
                total += a;
            }
        } while ((a > 0) && (a % 2 == 0));
        System.out.println("Toplam :" + total);
    }
}
