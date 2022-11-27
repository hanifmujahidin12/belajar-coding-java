import java.util.Scanner;
import java.util.ArrayList;  



public class Daricoach {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = "A";//scan.nextLine();
        
        String[] arrString = {"String 1", "String 2", "String 3", "String 4"};
        
        /*
        for(String item : arrString){
            System.out.println(item);
        }
        */
        
        int[] arrInt = {1, 5, 7};
        
        /*
            Membuat array baru dari array yang sudah ada
            1. Bagaimana cara menambahkan isi array
            2. Filter kalau dia bukan != 5, tambahkan ke array baru
            
        
        */
    
        int newArr[] = new int[3];
        int lastIndex = 0;
        
        ArrayList<Integer> newArr2 = new ArrayList<Integer>();
        
        for(int item : arrInt){
            if(item != 5){
                newArr[lastIndex] = item;
                newArr2.add(item);
                lastIndex++;
            }
            
        }
        
        for(int item : newArr){
            System.out.println(item);
        }
        
        for(int item : newArr2){
            System.out.println(item);
        }
        
        //System.out.println(arrString[2]);
        
        //System.out.println(arrInt[2]);
        
        
        // String[][] arrString2 = {
        //     {"String 1", "String 2", "String 3"},
        //     {"String 4", "String 5"}
        // };
        
        //System.out.println(arrString2[0][2]);
        
        //Looping Statement
        /*
        int varNumber = 0;
        while(varNumber < 5){
            System.out.println("You have passed " + varNumber);
            
            varNumber++;
            //varNumber = varNumber + 1;
        }
        
        varNumber = 0;
        do{
            System.out.println("You have passed " + varNumber);
            
            varNumber++;
        }while(varNumber < 5);
        
        for(varNumber = 0; varNumber < 5 ; varNumber++){
            System.out.println("You have passed " + varNumber);
           
        }
        
        */
        
        
        //Conditional Statement
        
        /*
        if(input == "A"){
            System.out.println("You have passed 1");
        }
        
        if(input == "A"){
            System.out.println("You have passed 2");
        }
        else{
            System.out.println("You have passed 3");
        }
        
        */
    }
}