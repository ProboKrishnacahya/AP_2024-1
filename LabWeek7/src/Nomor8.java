import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[100];
        String[] nims = new String[100];
        double[] afl1 = new double[100];
        double[] afl2 = new double[100];
        double[] afl3 = new double[100];
        double[] alp = new double[100];
        int studentCount = 0;

        while (true) {
            System.out.println("SIFT Student Database");
            System.out.println("=========================");
            System.out.println("Please select your option");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Find Student");
            System.out.println("0. Exit");

            System.out.print("Insert: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) {
                System.out.println("Goodbye :D");
                break;
            } else if (input == 1) {
                if (studentCount < 100) {
                    System.out.print("Input Student’s Name: ");
                    names[studentCount] = scanner.nextLine();

                    System.out.print("Input Student’s NIM: ");
                    nims[studentCount] = scanner.nextLine();

                    double score;
                    while (true) {
                        System.out.print("Input AFL1 Score (0-100): ");
                        score = scanner.nextDouble();
                        scanner.nextLine();
                        if (score >= 0 && score <= 100) {
                            afl1[studentCount] = score;
                            break; // Jika skor valid
                        } else {
                            System.out.println("Invalid score! Please enter a score between 0 and 100.");
                        }
                    }

                    while (true) {
                        System.out.print("Input AFL2 Score (0-100): ");
                        score = scanner.nextDouble();
                        scanner.nextLine();
                        if (score >= 0 && score <= 100) {
                            afl2[studentCount] = score;
                            break;
                        } else {
                            System.out.println("Invalid score! Please enter a score between 0 and 100.");
                        }
                    }

                    while (true) {
                        System.out.print("Input AFL3 Score (0-100): ");
                        score = scanner.nextDouble();
                        scanner.nextLine();
                        if (score >= 0 && score <= 100) {
                            afl3[studentCount] = score;
                            break;
                        } else {
                            System.out.println("Invalid score! Please enter a score between 0 and 100.");
                        }
                    }

                    while (true) {
                        System.out.print("Input ALP Score (0-100): ");
                        score = scanner.nextDouble();
                        scanner.nextLine();
                        if (score >= 0 && score <= 100) {
                            alp[studentCount] = score;
                            break;
                        } else {
                            System.out.println("Invalid score! Please enter a score between 0 and 100.");
                        }
                    }

                    studentCount++;
                } else {
                    System.out.println("Student database is full.");
                }
            } else if (input == 2) {
                if (studentCount == 0) {
                    System.out.println("No data available.");
                } else {
                    System.out.println("Student List:");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.printf("Name: %s, NIM: %s, AFL1: %.2f, AFL2: %.2f, AFL3: %.2f, ALP: %.2f, AVG: %.2f%n",
                                names[i], nims[i], afl1[i], afl2[i], afl3[i], alp[i],
                                (afl1[i] + afl2[i] + afl3[i] + alp[i]) / 4.0);
                    }
                }
            } else if (input == 3) {
                System.out.print("Input NIM: ");
                String searchNim = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (nims[i].equals(searchNim)) {
                        found = true;
                        System.out.printf(
                                "Student’s Data%nName: %s%nNIM: %s%nAFL1: %.2f%nAFL2: %.2f%nAFL3: %.2f%nALP: %.2f%nAVG: %.2f%n",
                                names[i], nims[i], afl1[i], afl2[i], afl3[i], alp[i],
                                (afl1[i] + afl2[i] + afl3[i] + alp[i]) / 4.0);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No Student Found");
                }
            } else {
                System.out.println("Invalid option, please enter 0, 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}