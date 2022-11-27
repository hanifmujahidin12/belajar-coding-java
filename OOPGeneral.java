import java.util.Scanner;
import java.util.ArrayList;



class Product {
    private String name;
    private int price;
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
}



class Cabang {
    private String name;
    private String city;
    private ArrayList<Product> arrProduct;
    
    public Cabang(String name, String city){
        this.name = name;
        this.city = city;
        this.arrProduct = new ArrayList<Product>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCity(){
        return this.city;
    }



   public void addProduct(Product objProduct){
        this.arrProduct.add(objProduct);
    }
    
    public ArrayList<Product> getArrProduct(){
        return this.arrProduct;
    }
}



public class OOPGeneral {
      private String nama;
      private String lokasi;
      private ArrayList<Cabang> arrCabang;
      
      public Main(String nama, String lokasi) {
     
        //lengkapi code
        this.nama = nama;
        this.lokasi = lokasi;
        this.arrCabang = new ArrayList<Cabang>();
      }
      
      public String getNama() {
        return this.nama;
      }
      // saya tambah, karena tidak tau cara menggunakan method setNama
      public String getLokasi() {
        return this.lokasi;
      }
      
      public void setNama(String value) {
        //lengkapi code
        this.nama = value;
      }
      
      public void addArrCabang(Cabang newCabang) {
        //lengkapi code
        this.arrCabang.add(newCabang);
        
       
      }
      public void getinfo() {
        //lengkapi code
        System.out.println(getNama() + " Merupakan toko yang berada di " + this.lokasi);
        System.out.println("yang memiliki "+ arrCabang.size() +" Cabang, dengan nama:");
        
        /*
            Untuk bisa akses ke public attibute atau public method, akses dari "satuan" objectnya
            
            arrCabang => arraylist of class cabang
            arrCabang.get(0) => satuan object cabang
            arrProduct => arraylist of class product
            arrProduct.get(0) => satuan object product
               
        */
        
        for(Cabang item : arrCabang){
             System.out.println("Produk dari " + item.getName() + " di Kota " + item.getCity());
             
             for(Product itemProduct : item.getArrProduct()){    
                 System.out.println("* " + itemProduct.getName() + " harga : " + itemProduct.getPrice());
             
             }
             
        }
        //System.out.println("* " + arrCabang.get(0));
        //System.out.println("* " + arrCabang.get(1));
        
      }
    
      public static void main(String[] args) {
        /*
            Relasi :
            Main has 1 or more Cabang
            Cabang has 1 or more Product
        */
        
        //Deklarasi dan Inisialisasi value object dari class main
        Main objStore = new Main("toko Bunga", "bandung");
        
        //Deklarasi dan Inisialisasi value object dari class product
        Product pr1 = new Product("Mawar", 10000);
        Product pr2 = new Product("Melati", 15000);
        Product pr3 = new Product("Anggrek", 20000);
        
        //pr1.getName();
        //pr2.getPrice();
        
        //Deklarasi dan Inisialisasi value object dari class cabang
        Cabang cb1 = new Cabang("Cabang 1", "Jakarta");
        
        //ubah nama cabang via method
        cb1.setName("Cabang Baru");
        
        //add object product ke object cabang
        cb1.addProduct(pr1);
        cb1.addProduct(pr2);
        
        //add object cabang ke object main (store)
        objStore.addArrCabang(cb1);
        
        //Deklarasi dan Inisialisasi value object dari class cabang
        Cabang cb2 = new Cabang("Cabang 2", "Tangerang");
        
        //add object product ke object cabang
        cb2.addProduct(pr3);
        
        //add object cabang ke object main (store)
        objStore.addArrCabang(cb2);
        
        //objStore.addArrCabang("cabang dua");
        //objStore.addArrCabang("cabang tiga");
        
        //print informasi semua cabang dari objek main, termasuk semua cabang dan semua produk dari masing-masing cabang
        objStore.getinfo();
    }
}