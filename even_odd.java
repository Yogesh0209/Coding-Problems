import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if (n % 2 == 0) {
        System.out.println("The number " +n+ " is even");
      }else{
        System.out.println("The number " +n+ " is odd");
      }
    
      sc.close();  
    }
    
}
