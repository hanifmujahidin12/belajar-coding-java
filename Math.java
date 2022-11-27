public class Math {
    public static void main (String[] args){

        
        int x = 1 % 2;
        System.out.println(x);

        int y = returnInteger (5);
        int z = returnInteger (8);
        // System.out.println(y);
        // System.out.println(z);
    }

    public static int returnInteger (int number) {
        int x = 2+number;

        return x;
    }
}