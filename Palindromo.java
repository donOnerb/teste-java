import java.util.Locale;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var palavra = scanner.nextLine();
        palavra = palavra.toLowerCase(Locale.ROOT);
        palavra = palavra.replace(" ", "");
        var palavraLength = palavra.length();
        var loops = palavraLength / 2;
        for(int i = 0, f = palavraLength - 1; i < loops; i++, f--) {
            if(palavra.charAt(i) != palavra.charAt(f)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
