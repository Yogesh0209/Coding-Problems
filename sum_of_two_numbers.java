import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result;
        System.out.print("Enter the value of first number : ");
        int first_number = scanner.nextInt();
        
        System.out.print("Enter the value of second number : ");
        int second_number = scanner.nextInt();

        result = first_number + second_number;

        System.out.println("The sum of first and second number is : " +result);

        scanner.close();
    }
}
