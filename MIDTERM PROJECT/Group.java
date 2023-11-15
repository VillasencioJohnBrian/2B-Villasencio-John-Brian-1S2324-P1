import java.util.Scanner;

public class Group {
    

    public void display(){
        System.out.println("Activity 3");
        System.out.println("Group Members Personal info: \n");
    }

}
class Villasencio extends Group {

    protected String Fullname = "Villasencio, John Brian N.";
    public int age = 21;
    String address = "Luy-a medellin, cebu";
    protected String gender = "Male";


    public void display(){
        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("\n");

    }
    
}

class Yaun extends Group {

    protected String Fullname = "Joshrael, Yaun";
    public int age = 26;
    String address = "Antipolo Medellin, Cebu";
    protected String gender = "Male";

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("\n");

    }

}

class Baring extends Group {

    protected String Fullname = "Junel Baring";
    public int age;
    String address;
    protected String gender;

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: ");
        System.out.println("Address: ");
        System.out.println("Gender: ");
        System.out.println("\n");

    }

}

class Hijapon extends Group{

    protected String Fullname = "Maridel Rodrigo Hijapon"; 
    public int age;
    String address;
    protected String gender;

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: ");
        System.out.println("Address: ");
        System.out.println("Gender: ");
        System.out.println("\n");


    }
}
class enter extends Group{

    Scanner input = new Scanner(System.in);
    protected String Fullname;
    public int age;
    String address;
    protected String gender;

    public void display() {
        System.out.println("");
        System.out.print("Fullname: ");
        Fullname = input.next();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Address: ");
        address = input.next();
        System.out.print("Gender: ");
        gender = input.next();
        System.out.println();

    }



}
