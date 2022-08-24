import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //System.out.println(num1 + " numb 2: " + num2);

        System.out.println("Addition of the two numbers: " + add(num1, num2));

        System.out.println("Subtraction of the two numbers: " + subtract(num1, num2));

        System.out.println("Multiplication of the two numbers: " + multiply(num1, num2));

        System.out.println("Division of the two numbers: " + divide(num1, num2));


    }
    public static int add(int n1, int n2){
        return n1 + n2;
    }
    public static int subtract(int n1, int n2){
        return n1 - n2;
    }
    public static int multiply(int n1, int n2){
        return n1 * n2;
    }
    public static int divide(int n1, int n2){
        return n1 / n2;
    }
}
