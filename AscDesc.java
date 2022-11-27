import java.util.Scanner;

public class AscDesc {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String input = scan.next();
        
        if (input.equals("Asc")){
            for(int i=1; i<=number; i++){
            System.out.print(i + " ");
            }
        }
        else if (input.equals("Desc")){
             for(int i=number; i>=1; i--){
             System.out.print(i + " ");   
             }
         }
        else
        System.out.println("Wrong input");
    }
}