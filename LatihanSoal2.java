import java.util.Scanner;

public class LatihanSoal2{
    public static void main(String [] args) {          
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();

        
        String [] arrayString = str.split(" ");
        int [] arrInt = new int[3];
        int sum = 0;

        for(int i = 0; i < arrayString.length; i++){
            arrInt[i] = Integer.parseInt(arrayString[i]);
        }
        
        // arrInt [0] = Integer.parseInt(arrayString [0]);
        // arrInt [1] = Integer.parseInt(arrayString [1]);
        // arrInt [2] = Integer.parseInt(arrayString [2]);

        for(int i = arrInt[0];i < arrInt[1]; i++){
            if (i % arrInt[2] == 0){
                sum += i;
            }   
        }
        System.out.println(sum);
        
    }
}