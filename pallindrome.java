import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the string for Pallindrome detection : "); 
       String input = scanner.nextLine();
       String reversed = "";
      
       for(int i = input.length() - 1 ; i >= 0 ; i--){
        reversed = reversed + input.charAt(i);
       }
       if (input.equals(reversed)){
        System.out.println("True");
       }else{
        System.out.println("False");
       }
       scanner.close();
    }
}
