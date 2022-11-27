import java.util.Scanner;
import java.util.ArrayList;


public class OopTokoBunga {
    private String nama;
      private String lokasi;
      private ArrayList<String> arrCabang;
      
      public Main(String nama, String lokasi) {
     
        //lengkapi code
        this.lokasi = lokasi;
        this.arrCabang = new ArrayList<String>();
      }
      
      public String getNama() {
        return this.nama;
      }
      
      public void setNama(String value) {
        //lengkapi code
        this.nama = value;
      }
      
      public void addArrCabang(String newCabang) {
        //lengkapi code
       
      }
      public void getinfo() {
        //lengkapi code
        System.out.println("Print Disini");
      
        
      }
    public static void main(String[] args) {
        //Write your code here
        Main objStore = new Main("toko Bunga", "bandung");
        objStore.addArrCabang("cabang satu");
        objStore.addArrCabang("cabang dua");
        objStore.getinfo();
    }
}