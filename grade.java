import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        System.out.println("Enter the marks for each subject:");
        int totalMarks = 0;
        int subjectCount = 0;
        for (int i = 1; i <= Subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            if (marks == 0) {
                System.out.println("Fail");
                return;
            }
            totalMarks += marks;
            subjectCount++;
        }

        int averageMarks = totalMarks / subjectCount;

        System.out.println("Average marks: " + averageMarks);

        String grade;
        if (averageMarks > 90) 
{
grade = "S";
}
else if (averageMarks >= 81) 
{
grade = "A";
} else if (averageMarks >= 71) 
{
grade = "B";
{
 else if (averageMarks >= 61) 
{
grade = "C";
}
 else if (averageMarks >= 51) 
{
            grade = "A";
            grade = "B";
        }

        System.out.println("Grade: " + grade);
    }
}