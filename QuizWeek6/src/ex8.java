import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Total Belanja = ");
        int belanja = s.nextInt();
        System.out.print("Anggota VIP (ya/tidak) = ");
        String vip = s.next() + s.nextLine();

        double dis = 0;

        if (belanja > 500000) {
            dis = 10;

            if (vip.equalsIgnoreCase("ya")) {
                dis += 5;

            }
        }
        double totalBayar = belanja - (belanja * dis / 100);

        if (dis > 0) {
            System.out.println(dis + totalBayar);
        } else {
            System.out.println(belanja);

        }

        s.close();
    }

}