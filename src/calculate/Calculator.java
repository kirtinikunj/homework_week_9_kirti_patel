package calculate;

public class Calculator {

    public static void addition(int a,int b){
        System.out.println(a+b);
    }

    public static void subtraction(int a,int b){
        System.out.println(a-b);
    }

    public static void division(int a,int b){
        System.out.println(a/b);
    }

    public static void multiplication(int a,int b){
        System.out.println(a*b);
    }

    public static void caculateResult(int a,int b,char symbol){


            if (symbol == '+') {
                System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
            } else if (symbol == '-') {
                System.out.println("Subtraction of " + a + " and " + b + "is : " + (a - b));
            } else if (symbol == '*') {
                System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
            } else {
                System.out.println("Division of " + a + " and " + b + " is : " + (a / b));

            }


    }
}
