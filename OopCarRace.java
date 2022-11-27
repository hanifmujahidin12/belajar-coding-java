import java.util.Scanner;
import java.util.ArrayList;


class Car{
    private String name;
    private int speed; //speed per lap

    public void setName(String name){
        //completed the code
        this.name=name;
    }
    
    public void setSpeed(int speed){
        //completed the code
        this.speed=speed;
    }

    public String getName(){
        //completed the code
        String name = getName();
        return "";
    }

    public int getSpeed(){
        //completed the code
        int speed = getSpeed();
        return 0;
    }
}


class Race{
    private String name;
    private ArrayList<Car> arrCar = new ArrayList<Car>();
    private int length;

    public void setName(String name){
        //completed the code
        this.name=name;
    }
    
    public void setLength(int length){
        //completed the code
        this.length=length;
    }

    //Add 1 object car to arrCar
    public void addCar(Car objCar){
        //completed the code
        
    }

    public void startRace(){
        //Buat race yang mensimulasikan balapan
        //Simulasikan jarak yang ditempuh oleh setiap mobil yang ada setiap lapnya sesuai dengan urutan masuk objCar di arrCar
        //Jika ada 1 mobil yang mencapai garis finish / length dari class Race, maka pemenang balapan sudah dapat ditentukan dan balapan selesai
        //Print status setiap lap (perhatikan expected output yang muncul)

        //completed the code
        System.out.println("Print here");
    }
}


public class OopCarRace {
    
    public static void main(String[] args) {
        Race objRace = new Race();
        objRace.setName("Mandalika");
        objRace.setLength(100);

        Car objCar1 = new Car();
        objCar1.setName("Yamahi");
        objCar1.setSpeed(10);
        
        Car objCar2 = new Car();
        objCar1.setName("Hondi");
        objCar1.setSpeed(17);
        
        Car objCar3 = new Car();
        objCar1.setName("Suzuka");
        objCar1.setSpeed(15);
        
        objRace.addCar(objCar1);
        objRace.addCar(objCar2);
        objRace.addCar(objCar3);
        
        objRace.startRace();

    }
}