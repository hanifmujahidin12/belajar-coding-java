public class OOPCoachAqwam {
    public static void main (String[] args){
        Meja meja1 = new Meja (50, 70, "alumunium");
        System.out.println("Jenis meja yg kamu pesan adalah: ");
        System.out.println("tinggi: " + meja1.tinggi);
        System.out.println("lebar: " + meja1.lebar);
        System.out.println("bahan: " + meja1.bahan + "\n");

        // Meja meja2 = new Meja (60, 40);
        meja1= new Meja (60,40);
        System.out.println("akan diubah menjadi: ");
        System.out.println("tinggi: " + meja1.tinggi);
        System.out.println("lebar: " + meja1.lebar + "\n");

        meja1=new Meja (40, "kayu");
        System.out.println("selanjutnya seperti: ");
        System.out.println("lebar: " + meja1.lebar);
        System.out.println("bahan: " + meja1.bahan + "\n");

        meja1=new Meja ();
        System.out.println("selanjutnya lagi akan: ");
        System.out.println("\n");
    }


    public static class Meja{
        double tinggi;
        int lebar;
        String bahan;

        Meja (double tinggi, int lebar, String bahan){
            this.tinggi=tinggi;
            this.lebar=lebar;
            this.bahan=bahan;
        }

        Meja (double tinggi, int lebar){
            this.tinggi=tinggi;
            this.lebar=lebar;
        }

        Meja (int lebar, String bahan){
            this.lebar=lebar;
            this.bahan=bahan;
        }

        Meja (){
        }
    }
}