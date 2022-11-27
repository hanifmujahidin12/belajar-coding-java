import java.util.Scanner;

public class OopFruitClass {
    private String name;
      private String color;
      public Main(String name, String color) {
        //lengkapi code
        this.name = name;
    
      }
      public String getName() {
        //lengkapi code
        return "";
      }
      public String getColor() {
        return this.color;
      }
      public void getInfo() {
        //lengkapi code
    
        System.out.println("Print disini");
      }
    public static void main(String[] args) {
        Main objFruit = new Main("Banana", "Yellow");
        Main objFruit2 = new Main("Apple", "Red");
        
        objFruit.getInfo();
        objFruit2.getInfo();
    }
}