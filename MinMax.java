import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        String input2 = scan.next();

        boolean isNumeric1 = isNumeric(input1);
        boolean isNumeric2 = isNumeric(input2);

            if (isNumeric1 && isNumeric2) {
                int number1 = Integer.parseInt(input1);
                int number2 = Integer.parseInt(input2);
                int hasilModular1 = number1 % 5;
                int hasilModular2 = number2 % 5;

                if(number1 == number2){
                    System.out.println("Same Input");
                } else if (hasilModular1 == hasilModular2) {
                    if (number1>number2)
                        System.out.println(number1);
                    else
                        System.out.println(number2);
                } else if (hasilModular1 != hasilModular2) {
                    if (number1>number2)
                        System.out.println(number2);
                    else
                        System.out.println(number1);
                }
                else{
                    System.out.println("Wrong Input");
                }
            }
        }


     public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } 
        catch(NumberFormatException e){
            return false;
        }
    }
}