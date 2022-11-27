import java.util.Scanner;
import java.util.Locale;







public class Main {
    
    
    //Function
    /*  3 Poin yang perlu diingat dari Function
        1. Parameter  (optional) => Apa yang bisa kita kasih? String
        2. Return value  (optional) => Mau balikannya dalam bentuk apa? void
        3. Process / Logic di dalamnya => Proses ditentukan dari no.1 dan no.2
    
    */
    

    int calculate(int parameter1){
        //Process
        int returnValue = parameter1 + 2;
        
        return returnValue;
    }
    
    static int calculate2(int parameter1){
        //Process
        int returnValue = parameter1 + 2;
        
        return returnValue;
    }
    
    public static void main(String[] args) {
        //Write your code here
        
        //Main obj1 = new Main();
        
        //int resultCalculate = calculate(10);
        //System.out.println(obj1.calculate(10));
        //System.out.println(calculate2(20));\
        
        //Scanner scan = new Scanner(System.in);



       String str = "Codingid";//scan.nextLine().toLowerCase();



       int[] arrInt = {1, 5, 7};
        
        procString(str, arrInt);
        procString("StringContoh", arrInt);
        
        
        
        /*
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        
        char[] newChar = input.toCharArray();
        
        String[] newString = input.split("");
        
        for(String item : newString){
            System.out.println(item);
        }
        
        String inpt = input.toLowerCase();
        int legt = inpt.length();
        String[] recoy = inpt.split('');



       for (int i = 0; i < (legt/2);i++){
            System.out.println(recoy[i]+recoy[(legt-1)-i]);
        }
        
        //for(int i=0;i<input.length()/2 ;i++){
            //System.out.println(""+input.charAt(i)+input.charAt(input.length()-1-i));
        //}
        */
    }
    
    
    static void procString(String param, int[] paramArray){
        char [] arrString = param.toCharArray();



       int j = arrString.length -1;



       for(int i=0; i < arrString.length/2; i++){
            System.out.print(arrString[i] + Integer.toString(paramArray[0]));
            System.out.println(arrString[j] + Integer.toString(paramArray[1]));
            j--;



       }
    }
}