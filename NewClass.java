import java.util.Scanner;

public class NewClass {
    
        private String newname;
    
    public NewClass(String newname) {
        
        this.newname = newname;
          
        
    }
    
    public void speak() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        newname = input.nextLine();
        System.out.println();
        System.out.println("Your name is "+newname+".");
               
        
    }
    
}
