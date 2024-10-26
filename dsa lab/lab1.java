
import java.util.LinkedList;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();  

        
        LinkedList<Character> charList = new LinkedList<>();

        
        for (int i = 0; i < input.length(); i++) {
            charList.add(input.charAt(i));  
        }

        
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, cout = 0;

        
        for (char ch : charList) {
            switch (ch) {
                case 'a':
                    countA++;
                    cout++;
                    break;
                case 'e':
                    countE++;
                    cout++;
                    break;
                case 'i':
                    countI++;
                    cout++;
                    break;
                case 'o':
                    countO++;
                    cout++;
                    break;
                case 'u':
                    countU++;
                    cout++;
                    break;
                default:
                    
                    break;
            }
        }

       
        System.out.println("Vowel Counts:");
        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);
        System.out.println("total number of vowel " + cout);

        
        scanner.close();
    }
}
