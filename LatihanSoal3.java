import java.util.Scanner;

public class LatihanSoal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        char [] arrString = str.toCharArray();
        int j = arrString.length -1;

        for(int i=0; i < arrString.length/2; i++){
            System.out.print(arrString[i]);
            System.out.println(arrString[j]);
            j--;
        }
    }
}