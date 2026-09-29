import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // 1) for
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // 2) while (variabel pencacah sendiri)
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++;
        }
        System.out.println();

        // 3) do-while (variabel pencacah sendiri)
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();


    }
}