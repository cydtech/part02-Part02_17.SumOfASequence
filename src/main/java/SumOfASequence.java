
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        num++;
        int total = 0;

        for (int i = 0; i < num; i++) {
            total = total + i;
        }
        System.out.println("The sum is " + total);

    }
}
