import java.util.Scanner;

public class Week6 {
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;

        for(int y = 0; y <= N; y++) {
            n3 = n1+ n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(y);
        s.close();
    } 
}