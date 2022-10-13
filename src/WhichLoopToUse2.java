import java.util.Scanner;

public class WhichLoopToUse2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            System.out.print("Enter a number: ");
        }
        double number = in.nextDouble();
    }
}
