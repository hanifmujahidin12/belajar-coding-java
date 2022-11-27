import java.util.Scanner;



public class NumberRow {
    
    public static int isNumeric(String strNum) {
        if (strNum == null) {
            return -1;
        }
        int d;
        try {
            d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return -1;
        }
        return d;
    }
    
    /*
        Apa yang bisa kita kasih? => parameter
        Bentuk yang mau jadi balikan? => return
        Prosesnya gmana?
    
    */
    
    static void procNumber(int number, String sort){
        
        if(sort.equals("Asc")){
            for(int x = 1; x<=number ; x++){
                System.out.print(x + " ");
            }
        }
        else{
            for(int x = number; x>=1; x--){
                System.out.print(x + " ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        //Write your code here



       Scanner scan = new Scanner(System.in);
        
        String xx = scan.nextLine();
        String yy = scan.nextLine();
        
        int inNumber = isNumeric(xx);
        if(inNumber<0 || !(yy.equals("Asc") || yy.equals("Desc"))){
            System.out.println("Wrong Input");
            return;
        }



       int number = inNumber;//scan.nextInt();



       String input = yy;//scan.next();



      



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
        
        /*
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String input2 = scan.nextLine();
        
        /*
            Devide and Conquer
            1. Ambil 2 input (V)
            2. Cek input 1 adalah number dan input 2 antara desc / asc (V)
            3. Buat looping berdasarkan asc / desc
        
        int inNumber = isNumeric(input);
        if(inNumber<0 || !(input2.equals("Asc") || input2.equals("Desc"))){
            System.out.println("Wrong Input");
            return;
        }
        
        procNumber(inNumber, input2);
        
        //System.out.println(input);
        //System.out.println(input2);
        
        */
    
}