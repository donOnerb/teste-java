import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        for(int i =0, f1 = 0, f2= 1; i < n; i++) {
            if(i == 0)
                System.out.println(1);
            else {
                var faux = f2;
                f2 += f1;
                f1 = faux;
                System.out.println(f2);
            }
        }
    }

}
