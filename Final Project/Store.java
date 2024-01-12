import java.util.Scanner;

abstract class Store {

    Scanner scanner = new Scanner(System.in);
    private String name;
    
    public String getName() {
        return name;

    }
    public void setName(String newName) {
        this.name = newName;
    }
    public Store (String newName) {
        name = newName;


    }
   
    abstract void display();
       
   
   

}