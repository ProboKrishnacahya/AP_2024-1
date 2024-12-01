import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tanggal hari ini (misal tanggal saat ini)
        System.out.print("Tanggal Hari Ini: ");
        String todayInput = scanner.nextLine();

        // Tanggal tujuan
        System.out.print("Tanggal Tujuan: ");
        String targetInput = scanner.nextLine();

        // Memastikan tanggal valid
        if (!cekValid(todayInput) || !cekValid(targetInput)) {
            System.out.println("--INVALID TIME--");
            return;
        }

        // Menghitung beda hari
        int daysDifference = hitungBedaHari(todayInput, targetInput);
        System.out.println("Beda hari = " + daysDifference);
    }

    // Mengecek apakah tanggal valid
    public static boolean cekValid(String date) {
        try {
            // Format tanggal dalam dd/MM/yyyy
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Menghitung beda hari antara dua tanggal
    public static int hitungBedaHari(String todayInput, String targetInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        // Mengubah String ke LocalDate
        LocalDate today = LocalDate.parse(todayInput, formatter);
        LocalDate target = LocalDate.parse(targetInput, formatter);

        // Menghitung perbedaan hari antara dua tanggal
        long daysBetween = ChronoUnit.DAYS.between(today, target);
        return (int) daysBetween;
    }
}