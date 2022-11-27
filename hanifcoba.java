public class hanifcoba {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int n=scan.nextInt();

        System.out.println("\n"+n);

        if (n>50) {
            System.out.println("Max. input is 50!");
        }
        else {
            for (int i=1; i <= -n; i++); {
                if (i % 2 == 1){
                    System.out.println("Odd");
                }             
            else
                System.out.println(i + " "); 
            }
                
        }
    }

}