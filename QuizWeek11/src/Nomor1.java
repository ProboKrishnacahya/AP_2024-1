import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (0-99): ");
        int angka = scanner.nextInt();

        if (angka < 0 || angka > 99) {
            System.out.println("Angka harus antara 0 dan 99.");
        } else {
            System.out.println("Output = " + angkaToText(angka));
        }

        scanner.close();
    }

    public static String angkaToText(int angka) {
        String[] satuan = {
                "nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"
        };

        String[] belasan = {
                "sepuluh", "sebelas", "dua belas", "tiga belas", "empat belas", "lima belas",
                "enam belas", "tujuh belas", "delapan belas", "sembilan belas"
        };

        if (angka < 10) {
            return satuan[angka]; // untuk angka 0 - 9
        } else if (angka >= 10 && angka < 20) {
            return belasan[angka - 10]; // untuk angka 10 - 19
        } else {
            int puluhan = angka / 10;
            int sisa = angka % 10;

            // untuk angka 20 - 99
            String[] puluhanText = {
                    "", "", "dua puluh", "tiga puluh", "empat puluh", "lima puluh",
                    "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"
            };

            if (sisa == 0) {
                return puluhanText[puluhan]; // hanya puluhan
            } else {
                return puluhanText[puluhan] + " " + satuan[sisa]; // puluhan + satuan
            }
        }
    }
}