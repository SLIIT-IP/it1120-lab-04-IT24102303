import java.util.Scanner;

public class IT24102303Lab4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks and validate

        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) 
        {
            System.out.println("Invalid input for exam marks.Terminating program.");
            return;
        }

        // Input lab submission marks and validate

        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) 
        {
            System.out.println("Invalid input for lab submission marks. Terminating program. ");
            return;
        }

        // Input percentages for exam and lab and validate

        System.out.print("Please enter the percentage given for the exam: ");
        int examPercentage = input.nextInt();

        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercentage = input.nextInt();

        if (examPercentage + labPercentage != 100) 
        {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate the final mark

        double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
        System.out.println("Final Exam Mark is: " + finalMark);
    }
}
