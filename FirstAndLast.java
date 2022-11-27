import java.util.Scanner;

public class FirstAndLast {
   public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        boolean isNumeric = isNumeric(input);
        
        if (isNumeric){
            int n = input.length();
            System.out.println("First: " + input.substring(0,1));
            System.out.println("Last: " + input.substring(n-1,n));
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } 
        catch(NumberFormatException e){
            return false;
        }
    }
}