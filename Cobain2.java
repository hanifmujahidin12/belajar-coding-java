import java.util.Scanner;

//Proses input angka, tampilkan angka dari 1 sampai n. Kalo misalkan angka kelipatan 3, outputnya "kelipatan-3"
//Kalo misalkan kelipatan 15, outputnya "kelipatan-15" dengan angka minimum 50, angka maksimum 100
//tampilkan berderet kebawah

public class Cobain2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int n=scan.nextInt();
        System.out.println("\n"+n);

        if (n>100 || n<5) {
            System.out.println("Angka yang perlu dimasukkan 5-100");
        }
        else {
            for (int x=1; x<=n; x++){
                if (x%5 == 0 && x%3 == 0){
                    System.out.println("Kelipatan-3 dan kelipatan-5 " + x);
                }
                else if (x % 5 == 0) {
                    System.out.println("kelipatan-5 " + x);
                }
                else if (x % 3 == 0) {
                    System.out.println("kelipatan-3 " + x);
                }
                else {
                    System.out.println(x);
                }
            }
            
           
            
        }

    }
}