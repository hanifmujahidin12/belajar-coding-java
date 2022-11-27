import java.util.Scanner;

public class MagicPrime{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number = 101;
        int count = 1;
        for (;count <= n; number++){
            boolean isPrint = true;
            String stringNumber = String.valueOf(number);
            int firstIndex = 0;
            System.out.println("Index angka yang akan dicek: "+stringNumber.length());
            for (int i = 0; i < stringNumber.length(); i++){
                String numberToCheck = stringNumber.substring(firstIndex,stringNumber.length());
                double doubles = Double.parseDouble(numberToCheck);
                System.out.println( "Angka yang sudah di substring : "+numberToCheck);
                System.out.println("Apakah ini angka prima? " + isPrime(doubles));
                firstIndex++;
                if (!isPrime(doubles)){
                    System.out.println("Masuk Kondisi Bukan Angka Prima ----> " + numberToCheck);
                    isPrint=false;
                }
            }

            System.out.println("is print : " + isPrint);
            if (isPrint){
                System.out.println("#" + count +" Number => " + number);
                count++;
            }

            System.out.println();
        }
    }

    public static boolean isPrime(double x) {
        if (x == 0 || x == 1){
            return false;
        }
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/*
 * 1. masih harus banyak latihan
 * 2. searching harus sambil dibaca
 * 3. cara searching
 * 4. harus lebih paham variabel
 * 5. inisialisasi variabel, deklarasi variabel, cara buat variabel, mendeskripsikan dan fungsi variabel
 * 6. urutan proses, sistematisnya diperhatikan
 * 
 */