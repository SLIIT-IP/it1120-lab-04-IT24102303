import java.util.Scanner;

public class IT24102303Lab4Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        String result = (number > 0) ? "The number is Positive" :
                        (number < 0) ? "The number is Negative" :
                        "The number is Zero";

        System.out.print(result);
    }
}
