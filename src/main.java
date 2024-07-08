import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter Number one : ");
        num1 = scanner.nextInt();

        System.out.print("Enter Number tow : ");
        num2 = scanner.nextInt();

        Addition addition = new Addition();

        int sum = addition.add(num1, num2);

        System.out.println("Sum is : " + sum);
    }
}
