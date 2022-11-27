import java.util.Scanner;



public class ClosestPalindrome {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        angka = Integer.parseInt(input);
        int angka = input;
   
        int x =1000;
        // try{
        //     String input = scan.nextLine();
        //     System.out.println("angkanya adalah: " + angka);
        //     angka = Integer.parseInt(input);
        //     System.out.println("angkanya adalah: " + angka);
        //     angka = 1000;
        //     System.out.println("angkanya adalah: " + angka);
        //     angka = x;
        //     System.out.println(angka);
        // }catch (Exception ex){
        //     System.out.println("Wrong Input");
        //     return;
        // }




       int loop = 1;
        while(true){
            int mundur = angka-loop;
            int maju = angka+loop;
            boolean majuPal = isPalindrom(maju+"");
            boolean mundPal = isPalindrom(mundur+"");
            if(majuPal==true && mundPal==true){
                System.out.printf("Closest Palindrome: %d",mundur);
                break;
            }else if(majuPal==true || mundPal==true){
                System.out.printf("Closest Palindrome: %d",majuPal ? maju : mundur);
               
                int value;
                if(majuPal == true){
                    value = maju;
                }else{
                    value = mundur;
                }
                    System.out.println(value);
                    
                break;
                
            }
            loop++;
        }
    }
    public static boolean isPalindrom(String input){
        char[] arrWord = input.toCharArray();
        boolean isPalindrom = true;
        for(int i=0 ;i < arrWord.length/2 ; i++){
            if(arrWord[i] != arrWord[arrWord.length-1-i]){
                isPalindrom = false;
                break;
            }
        }



       return isPalindrom;
    }
}