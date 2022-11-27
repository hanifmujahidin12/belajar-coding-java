import java.util.Scanner;
import java.util.ArrayList;

public class TokoBunga {
  private String nama;
  private String lokasi;
  private ArrayList<String> arrCabang;

  public OOPTokoBunga(String nama, String lokasi) {

      //lengkapi code
      this.nama = nama;
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
      this.arrCabang.add(newCabang);
  }
  public void getinfo() {
      //lengkapi code
      System.out.println(nama+" Merupakan toko yang berada di "+lokasi);
      System.out.println("yang memiliki "+arrCabang.size()+" Cabang, dengan nama:");
      System.out.println("* "+arrCabang.get(0));
      System.out.println("* "+arrCabang.get(1));


  }
  public static void main(String[] args) {
      //Write your code here
      OOPTokoBunga objStore = new OOPTokoBunga("toko Bunga", "bandung");
      objStore.addArrCabang("cabang satu");
      objStore.addArrCabang("cabang dua");
      objStore.getinfo();
  }
}
