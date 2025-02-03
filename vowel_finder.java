import java.util.Scanner;

public class vowel_finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        int vowelcount = 0;
        
        for (char ch : str.toLowerCase().toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch  == 'u') {
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
        scanner.close();        
    }
}
