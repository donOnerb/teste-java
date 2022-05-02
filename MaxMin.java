import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var length = scanner.nextInt();

        var numberList = new ArrayList<Integer>();

        for(int i = 0; i < length; i++)
            numberList.add(scanner.nextInt());

        var max = numberList.get(0);
        var min = numberList.get(0);
        for(var number : numberList) {
            if(number > max)
                max = number;
            if(number < min)
                min = number;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
