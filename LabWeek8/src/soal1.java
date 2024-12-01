import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int[][] kelas = new int[5][4];

        for (int a = 0; a < 5; a++) {
            System.out.println("Masukan nilai untuk siswa ke-" + (a + 1));
            for (int b = 0; b < 4; b++) {
                Scanner s = new Scanner(System.in);
                System.out.println("nilai ke-" + (b + 1) + " = ");
                kelas[a][b] = s.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += kelas[i][j];
                double avg = (double) total / 4;
                System.out.println("Rata-rata siswa " + (i + 1) + " = " + avg);
            }
        }
    }
}