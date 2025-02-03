import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number you want to find factorial : ");
    int num = scanner.nextInt();
    int fact = 1;

    for(int i = num ; i >= 1 ; i--){
      fact = fact * i;
    }
    System.out.println(fact);
    scanner.close();
   } 
}
