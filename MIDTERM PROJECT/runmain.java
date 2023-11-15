import java.util.Scanner;

public class runmain{

    public static void main(String [] args) {

        Group g = new Group();
        g.display();

        Villasencio v = new Villasencio();
        v.display();

        Yaun y = new Yaun();
        y.display();

        Baring b = new Baring();
        b.display();

        Hijapon h = new Hijapon();
        h.display();


        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter your own info? type \"Yes\" or \"No\". ");
        System.out.print("Enter your choice: ");
        String choice = input.next();
        
        switch(choice) {

            case "Yes":
            System.out.print("How many do you want to create? ");
            int num = input.nextInt();

            int[] arr;
            for (int i = 0; i < num; i++) {
                
                enter e = new enter();
                e.display();

            }

            if (num == num) {
                System.out.println("Program finished!");
            }
            break;
            
            case "No":
            System.out.println("Program Closed.");

        }

       

    }
}