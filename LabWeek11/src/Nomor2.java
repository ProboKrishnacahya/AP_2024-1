import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input waktu mulai
        System.out.print("Start time (HH:MM): ");
        String startTime = scanner.nextLine();

        // Validasi waktu mulai
        if (!isValidTime(startTime)) {
            System.out.println("--INVALID TIME--");
            return; // Keluar dari program jika waktu mulai tidak valid
        }

        // Input waktu selesai
        System.out.print("End time (HH:MM): ");
        String endTime = scanner.nextLine();

        // Validasi waktu selesai
        if (!isValidTime(endTime)) {
            System.out.println("--INVALID TIME--");
            return; // Keluar dari program jika waktu selesai tidak valid
        }

        // Hitung dan tampilkan perbedaan waktu
        calculateTimeDifference(startTime, endTime);

        scanner.close();
    }

    // Fungsi untuk validasi waktu
    public static boolean isValidTime(String time) {
        // Memisahkan jam dan menit
        String[] timeParts = time.split(":");

        if (timeParts.length != 2)
            return false; // Harus ada dua bagian (jam dan menit)

        try {
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);

            // Mengecek apakah jam dan menit valid
            return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        } catch (NumberFormatException e) {
            return false; // Jika bukan angka
        }
    }

    // Fungsi untuk menghitung perbedaan waktu
    public static void calculateTimeDifference(String startTime, String endTime) {
        // Memisahkan jam dan menit untuk waktu mulai
        String[] startParts = startTime.split(":");
        int startHours = Integer.parseInt(startParts[0]);
        int startMinutes = Integer.parseInt(startParts[1]);

        // Memisahkan jam dan menit untuk waktu selesai
        String[] endParts = endTime.split(":");
        int endHours = Integer.parseInt(endParts[0]);
        int endMinutes = Integer.parseInt(endParts[1]);

        // Menghitung total menit dari masing-masing waktu
        int startTotalMinutes = startHours * 60 + startMinutes;
        int endTotalMinutes = endHours * 60 + endMinutes;

        // Menghitung perbedaan waktu dalam menit
        int differenceMinutes = endTotalMinutes - startTotalMinutes;

        // Jika waktu selesai lebih kecil dari waktu mulai, tambahkan 24 jam (1440
        // menit)
        if (differenceMinutes < 0) {
            differenceMinutes += 1440;
        }

        // Menghitung jam dan menit dari perbedaan waktu
        int diffHours = differenceMinutes / 60;
        int diffMinutes = differenceMinutes % 60;

        // Menampilkan hasil
        System.out.printf("Time Differ = %02d:%02d\n", diffHours, diffMinutes);
    }
}