package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char yesNo = 'y';
        char continueCal;

        Scanner s1 = new Scanner(System.in);

        do {
            System.out.print("Please enter first number : ");
            int num1 = s1.nextInt();
            System.out.print("Please enter second number :");
            int num2 = s1.nextInt();
            System.out.print("Please enter one of the symbol : '+', '-', '*', '/' : ");
            char symbol = s1.next().charAt(0);

            Calculator.caculateResult(num1, num2, symbol);

            System.out.println("Would you like to do more calculation? Please enter 'y' or 'n' :");


            continueCal = s1.next().charAt(0);
        } while ( continueCal== 'y' || continueCal == 'Y');


    }
}
