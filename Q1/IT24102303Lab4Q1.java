import java.util.Scanner;

public class IT24102303Lab4Q1 {
    public static void main(String[] args) 
    {  
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        String result;

        if (number > 0)
        { result = "The number is : Positive";}

        else if (number < 0)
        { result = "The number is : Negative";}

        else 
        { result = "The number is : Zero";}

        System.out.print(result); 

    }
}
