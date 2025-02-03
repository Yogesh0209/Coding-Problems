import java.util.Scanner;

public class sum_of_natural_number_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int sum = 0;
       System.out.print("Enter a value : ");
       int n = sc.nextInt();

       for (int i = 1 ; i <= n ; i++){
        sum = sum + i;
       }

       System.out.println("The sum of numbers is : " +sum );
       sc.close();
    }
}
