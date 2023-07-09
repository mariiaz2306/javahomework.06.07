package lesson;

public class MathOperations {
    public static int addition(int a, int b){
        return a + b;
    }
    public static int substraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }

    public static void main(String[] args){
        int num1 = 56;
        int num2 = 2;


        int sum = addition(num1, num2);
        int difference = substraction(num1, num2);
        int product = multiplication(num1, num2);
        double quotient = division(num1, num2);

        System.out.println("sum:" + sum);
        System.out.println("difference:" + difference);
        System.out.println("product:" + product);
        System.out.println("quotient:" + quotient);
    }
}
