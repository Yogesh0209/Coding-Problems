import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String orignal = sc.nextLine();
        String reversed = "";

        for(int i = orignal.length()-1 ; i>=0 ; i--){

            reversed = reversed + orignal.charAt(i);
        }
        System.out.println(reversed);
        sc.close();
    }
}
