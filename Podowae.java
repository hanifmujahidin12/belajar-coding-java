import java.util.Scanner;



public class Podowae {
   



   static void Podowae(String original){
        String reverse ="";
        int length = original.length();



       for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);



       //System.out.println(original);
        //System.out.println(reverse);



       if (original.equals(reverse))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase().replaceAll(" ", "");
        Podowae(input);
        
        /*
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase().replaceAll(" ", "");
        String reverseInput = "";
        for (int i = input.length() -1 ; i >= 0; i--) {
          reverseInput += input.charAt(i);
        }
        if(input.equals(reverseInput)){
             System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        */
        //System.out.println(input);
        //System.out.println(reverseInput);
    }
}