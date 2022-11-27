import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] stringCode = input.substring(0,3).toCharArray(); // googling
        char[] numberCode = input.substring(3,12).toCharArray(); // googling

        System.out.println(stringCode);
        System.out.println(numberCode);
        
        boolean isRightCode = true;
        
        if(input.length() != 12){
            isRightCode = false;
        }
        else{
            for(int i = 0; i < stringCode.length; i++){
                if(!Character.isUpperCase(stringCode[i])){ // googling
                    isRightCode = false;
                }
            }
            for(int i = 0; i < numberCode.length; i++){
                if(!Character.isDigit(numberCode[i])){ // googling
                    isRightCode = false;
                }
            }
        }
        
        if(isRightCode)
            System.out.println("Right Vaccination Code");
        else
           System.out.println("Wrong Vaccination Code");
    }
    
    
}