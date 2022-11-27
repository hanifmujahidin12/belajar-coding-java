import java.util.Scanner;

public class LatihanSoal1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // System.out.println("Hasilnya adalah:");

        if(n > 40) {
            System.out.println("Wrong Input");
        }
        else{
            for (int i = 1; i <= n; i++){
                if(i%2 == 0)
                System.out.print("O");
                else
                System.out.print("X");
            }
        }
    }
}