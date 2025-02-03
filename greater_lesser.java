import java.util.Scanner;

public class greater_lesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This programs checks the greater number.");
        System.out.print("Enter the value of a : ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b : ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c : ");
        int c = scanner.nextInt();

        if (a>b && a>c) {
            System.out.println(a+ " is the largest number");
        }else if(b>a && b>c){
            System.out.println(b+ " is the largest number");
        }else{
            System.out.println(c+ " is the largest number");
        }
        scanner.close();
    }
}
