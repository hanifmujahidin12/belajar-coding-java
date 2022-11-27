import java.util.Scanner;
import java.util.ArrayList;

public class AngkaBunshin {
    
    static int checkSum(int number){
        int sum = 0;
        for(int x = 1;x<=number/2;x++){
            if(number % x == 0){
                sum+=x;
            }
        }
        return sum;
    }
    
    static ArrayList<Integer> checkWithArrayList(int number){
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for(int x = 1;x<=number/2;x++){
            if(number % x == 0){
                sum.add(x);
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if(input < 1 || input > 10){
            System.out.println("Wrong Input");
            return;
        }
        
        int number = 220;
        int count = 0;
        
        while(true){
            int tempNumber = checkSum(number);
            int tempNumber2 = checkSum(tempNumber);
            
            //checkSum(checkSum(number))
            
            if(number == tempNumber2 && number != tempNumber){
                System.out.println(number + " Bunshin dengan " + tempNumber); 
                count++;

            }
            
            if(count >= input){
                return;
            }
            number++;
        }
        
    }
}