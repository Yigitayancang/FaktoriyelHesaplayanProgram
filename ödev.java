import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();
        if (n < r) {
            System.out.println("Hatalı giriş: n r'den küçük olamaz.");
        } else {
            long kombinasyon = hesaplaKombinasyon(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        }
    }
    public static long hesaplaKombinasyon(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            r = Math.min(r, n - r);
            long kombinasyon = 1;
            for (int i = 1; i <= r; i++) {
                kombinasyon *= (n - i + 1);
                kombinasyon /= i;
            }
            return kombinasyon;
        }
    }
}
