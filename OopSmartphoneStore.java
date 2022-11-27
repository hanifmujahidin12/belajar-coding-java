import java.util.Scanner;
import java.util.ArrayList;

class Smartphone{
    private String merk;
    private int amount;

    public void setMerk(String merk){
        //completed the code
    }
    
    public void setAmount(int amount){
        //completed the code
    }

    public String getMerk(){
        //complete the code
        return "";
    }

    public int getAmount(){
        return this.amount;
    }
    
}

class Store{
    public String name;
    private ArrayList<Smartphone> arrSmartphone = new ArrayList<Smartphone>();

    public void setName(String name){
        //completed the code
    }
    
    //Add 1 object smartphone to arrSmartphone
    public void addSmartphone(Smartphone objSmartphone){
        //completed the code
        
    }
    
    public void getInfo(){
        System.out.println(this.name + " Store have " + this.arrSmartphone.size() + " Smartphone Type with detail");
        //complete the code
        //print each smartphone merk with looping 

    }
}


public class OopSmartphoneStore {
    
    public static void main(String[] args) {
        
        Store objStore = new Store();
        objStore.setName("Tangerang Store");

        Smartphone objSmart1 = new Smartphone();
        objSmart1.setMerk("Oppa");
        objSmart1.setAmount(10);
        
        Smartphone objSmart2 = new Smartphone();
        objSmart2.setMerk("Samsul");
        objSmart2.setAmount(5);
        
        objStore.addSmartphone(objSmart1);
        objStore.addSmartphone(objSmart2);
        
        objStore.getInfo();
        

    }
}