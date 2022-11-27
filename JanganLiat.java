import java.util.Scanner;

public class JanganLiat {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowercase();
        char [] newChar = input.toCharArray();
        
        /*
        1. bikin array String
        2. split to uppercase
        3. looping ke-1, jika index ke-0 maka berhenti, jika index ke-1 maka print dengan kondisi lower case
        4. dst
        */
         for (int i=0; i<newChar.length; i++){
             for (int j=0; j<=1; j++) {
                 if (j == 0)
                    System.out.print(Character.toUpperCase(newChar[i]));
            
                else
                    System.out.print(newChar[i]);
                }
         if (i<newChar.length -1)
            System.out.print("-");
         }
    }
}