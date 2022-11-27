import java.util.Scanner;

public class WordProcess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase().replace(" ","");
       
        String result = "";
        //while(result.length <= input.length){
            //Bisa digunanakan untuk performa lebih baik di beberapa case
        //}
        for(int i = 0; i < input.length(); i++){
            if(!result.contains(String.valueOf(input.charAt(i)))){
               result += input.charAt(i);
              for(int a = i + 1; a < input.length(); a++){
                  if(input.charAt(i) == input.charAt(a)){
                      result += input.charAt(a);
                  }
              }
            }
        }
        
        /*
            1. input => codingid
            2. result => codd
        
        */
        
        System.out.print(result); 
        
    }
}