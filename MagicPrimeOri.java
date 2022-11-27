import java.util.Scanner;

public class MagicPrimeOri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number = 101;
        int count = 1;
        for (;count <= n; number++){
            boolean isPrint = true;
            String stringNumber = String.valueOf(number);
            int firstIndex = 0;
            for (int i = 0; i < stringNumber.length(); i++){
                String numberToCheck = stringNumber.substring(firstIndex,stringNumber.length());
                double doubles = Double.parseDouble(numberToCheck);
                firstIndex++;
                if (!isPrime(doubles)){
                    isPrint=false;
                }
            }
            if (isPrint){
                System.out.println("#" + count +" Number => " + number);
                count++;
            }

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