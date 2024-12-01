import java.util.Scanner;

public class Nomor7 {
    public void getQuestionsAndAnswers(Scanner input, String[] questions, String[][] options, int[] answers) {
        for (int i = 0; i < 3; i++) {
            System.out.print("\nPertanyaan ke-" + (i + 1) + ": ");
            questions[i] = input.nextLine();

            System.out.println("Pilihan jawaban:");
            // Get the options from the user
            for (int j = 0; j < 3; j++) {
                System.out.print("Opsi ke-" + (j + 1) + ": ");
                options[i][j] = input.nextLine();
            }

            // Validate the answer
            int answer;
            while (true) {
                System.out.print("Kunci jawaban (1-3): ");
                answer = input.nextInt();
                input.nextLine();

                // Validate the answer range
                if (answer >= 1 && answer <= 3) {
                    answers[i] = answer - 1; // Store the correct answer (index 0-2)
                    break;
                } else {
                    System.out.println("Kunci jawaban harus diantara opsi ke-1 hingga 3.");
                }
            }
        }
    }

    public void getUserAnswers(Scanner input, String[] questions, String[][] options, int[] userAnswers) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPertanyaan ke-" + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            int userAnswer;
            while (true) {
                System.out.print("Jawaban (1-3): ");
                // Get the user answer
                if (input.hasNextInt()) {
                    userAnswer = input.nextInt() - 1;
                    input.nextLine();

                    // Check if the user answer is between 1 and 3
                    if (userAnswer >= 0 && userAnswer <= 2) {
                        break;
                    } else {
                        System.out.println("Jawaban harus di antara opsi ke-1 hingga 3.");
                    }
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }

            // Store the user answer
            userAnswers[i] = userAnswer;
        }
    }

    // Check the answers and print results
    public int checkAnswers(String[] questions, String[][] options, int[] answers, int[] userAnswers, int score) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPertanyaan ke-" + (i + 1) + ": " + questions[i]);
            System.out.println("Kunci jawaban: " + options[i][answers[i]]);
            System.out.println("Jawabanmu: " + options[i][userAnswers[i]]);

            // Check if the user answer is correct
            if (userAnswers[i] == answers[i]) {
                System.out.println("Hasil = Benar!");
                // Increment the score if the answer is correct
                score++;
            } else {
                System.out.println("Hasil = Salah, jawaban yang benar adalah: " + options[i][answers[i]]);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Nomor7 nomor7 = new Nomor7();

        // Initialize arrays to store questions
        String[] questions = new String[3];
        // Store the options
        String[][] options = new String[3][3];
        // Store the correct answers
        int[] answers = new int[3];
        // Store the user answers
        int[] userAnswers = new int[3];

        System.out.println(
                "== Welcome to Quiz Builder! ==\nHai penanya, masukkan 3 pertanyaan beserta 3 opsi pilihan jawabannya.");
        // Get the questions, options, and answers from the user
        nomor7.getQuestionsAndAnswers(input, questions, options, answers);

        System.out.println("\n== Now, let's start the quiz!==\nHai penjawab, jawablah pertanyaan berikut ini.");
        // Ask the user the questions
        nomor7.getUserAnswers(input, questions, options, userAnswers);

        System.out.println("\n== Quiz Results ==");
        int score = 0;
        // Check the answers
        score = nomor7.checkAnswers(questions, options, answers, userAnswers, score);

        System.out.println("\nTotal benar = " + score + " dari 3");
        input.close();
    }
}