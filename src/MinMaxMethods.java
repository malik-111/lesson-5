import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        //System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println("min: " + min(num1, num2, num3));
        System.out.println("max: " + max(num1, num2, num3));
    }

    private static int min(int n1, int n2, int n3){
        int a = n1;

        if (a > n2) {
            a = n2;
        }
        if (a > n3) {
            a = n3;
        }
        return a;
    }

    private static double min(double n1, double n2, double n3){
        double a = n1;

        if (a > n2) {
            a = n2;
        }
        if (a > n3) {
            a = n3;
        }
        return a;
    }

    private static int max(int n1, int n2, int n3){
        int max;

        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
            } else
                max = n3;
        } else {
            if (n2 > n3)
                max = n2;
            else
                max = n3;
        }
        return max;
    }

}
