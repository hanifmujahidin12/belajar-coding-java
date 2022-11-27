import java.util.Scanner;

public class Compounding {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        char[] newChar = input.toCharArray();

        for (int i = 0; i < newChar.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) /* index 0 maka uppercase*/
                    System.out.print(Character.toUpperCase(newChar[i]));

                else
                    System.out.print(newChar[i]);
            }
            if (i < newChar.length - 1)
                System.out.print("-");
        }
    }
}