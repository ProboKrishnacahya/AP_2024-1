import java.util.Scanner;

public class Nomor5 {
    // Check the color name from the hex code
    public String checkColor(String hexCode, String[][] colors) {
        // Loop through the colors array to find the matching hex code and return the
        // color name
        for (int i = 0; i < colors.length; i++) {
            if (colors[i][0].equals(hexCode)) {
                return colors[i][1];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor5 nomor5 = new Nomor5();

        // Array of color names and their corresponding hex codes
        String[][] colors = {
                { "#FF0000", "merah" },
                { "#00FF00", "hijau" },
                { "#0000FF", "biru" },
                { "#FFFF00", "kuning" },
                { "#FFA500", "oranye" },
                { "#800080", "ungu" }
        };

        System.out.println("== Nama warna berdasarkan Hex Code ==");

        while (true) {
            // Generate a random index to get a random color
            int randomIndex = (int) (Math.random() * colors.length);
            // Get the hex code from the array
            String hexCode = colors[randomIndex][0];

            System.out.print("\nJika Hex Code nya " + hexCode + ", maka nama warnanya apa? ");
            String answer = scanner.nextLine().toLowerCase();

            // Exit the program if the user types 'q'
            if (answer.equals("q")) {
                System.out.println("Program selesai");
                System.exit(0);
            }

            // Get the correct color name using the checkColor function
            String correctColor = nomor5.checkColor(hexCode, colors);

            if (answer.equals(correctColor)) {
                System.out.println("Jawabannya benar");
            } else {
                System.out.println("Jawabannya salah, seharusnya " + correctColor);
            }
        }
    }
}