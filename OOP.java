import java.util.Scanner;

public class Main {
    private String name;
      private String color;
      public Main(String name, String color) {
        //lengkapi code
        this.name = name;
        this.color=color;
    
      }
      public String getName() {
        //lengkapi code
        return this.name;
      }
      public String getColor() {
        return this.color;
      }
      public void getInfo() {
        //lengkapi code
        System.out.println("Color Of " + this.name + " Is " + this.color);
      }
    public static void main(String[] args) {
        Main objFruit = new Main("Banana", "Yellow");
        Main objFruit2 = new Main("Apple", "Red");
        
        objFruit.getInfo();
        objFruit2.getInfo();
    }
}