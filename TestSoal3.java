import java.util.Scanner;

public class TestSoal3 {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nomer Vaksin: ");
        String input = scan.nextLine();

        // ARRAY = {A,B,C}
        
        boolean isRightCode = true;
        
        if(input.length() != 12){
            isRightCode = false;
        }
        else{
            char[] stringCode = input.substring(0,3).toCharArray(); // googling
            char[] numberCode = input.substring(3,12).toCharArray(); // googling

            // Validasi 3 karakter awal
            for(int i = 0; i < stringCode.length; i++){
                if(!Character.isUpperCase(stringCode[i])){ // googling
                    isRightCode = false;
                }
            }

            // Validasi 
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