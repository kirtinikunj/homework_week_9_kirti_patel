package homework_week_9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        //declaration of scanner
        Scanner s1 = new Scanner(System.in);

        //taking input from console
        System.out.print("Enter Student Name : ");
        String name = s1.nextLine();
        System.out.print("Enter Student Roll No :");
        int rollNo = s1.nextInt();

        System.out.print("Enter Marks of Subject Maths : ");
        int mathsMarks = s1.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please enter correct marks :");
            mathsMarks = s1.nextInt();
            break;
        }

        System.out.print("Enter Marks of Subject Science : ");
        int scienceMarks = s1.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please enter correct marks :");
            scienceMarks = s1.nextInt();
            break;
        }

        System.out.print("Enter Marks of Subject English : ");
        int englishMarks = s1.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please enter correct marks :");
            englishMarks = s1.nextInt();
            break;
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printMarkSheet(name, rollNo, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        s1.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the result on subject marks
    public static String calculateResult(int maths, int science, int english) {
        if (maths < 35 || science < 35 || english < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage > 50) {
            grade = "B+";
        } else if (percentage > 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing marksheet
    public static void printMarkSheet(String name, int rollNo, int maths, int science, int english, double total, double percentage, String result, String grade) {
        System.out.println("------------------------------");
        System.out.println("|                            |");
        System.out.println("|        MARK SHEET          |");
        System.out.println("|____________________________|");
        System.out.println("|  Name        :  " + name + "        |");
        System.out.println("|  Roll No     :  " + rollNo + "         |");
        System.out.println("|____________________________|");
        System.out.println("|  Subject     :    Marks    |");
        System.out.println("|____________________________|");
        System.out.println("|  Maths       :  " + maths + "         |");
        System.out.println("|  Science     :  " + science + "         |");
        System.out.println("|  English     :  " + english + "         |");
        System.out.println("|____________________________|");
        System.out.println("|  Total       :  " + total + "        |");
        System.out.println("|____________________________|");
        System.out.println("|  Percentage  :  " + percentage + "        |");
        System.out.println("|  Result      :  " + result + "       |");
        System.out.println("|  Grade       :  " + grade + "          |");
        System.out.println("|____________________________|");


    }

}
