import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println("The sum of numbers is : " +sum);
        
        sc.close();
    }
}
