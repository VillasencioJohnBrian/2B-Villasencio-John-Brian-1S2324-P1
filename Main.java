public class Main {
    
    

  
    public static void main(String[] args) {
        
        Human man = new Human("Arnold", 29);
        Human man2  = new Human("Elizabet", 28);
        //accessing attributes using the object name followed bot dot sign
        man.fname = "John Brian Villasencio N.";
        man.country = "Philippines";
        man.language = "Cebuano";
        man.age = 21;
        man.speak();
        man2.speak();
    
      
        
        System.out.println();
        System.out.println("Name:"+ man.fname);
        System.out.println("Country: " +man.country);
        System.out.println("language: "+man.language);
        System.out.println("Age: "+man.age);
        System.out.println("");
      
        //Multiple attributes 
        System.out.println("My name is "+man.fname+" and I am "+man.age);
        System.out.println("I lived in "+man.country+" and I speak "+ man.language);
        
        // creating multiple object without affecting the original variable attributes is 5
        Car num1 = new Car(); // object number 1 to print the original value of the variable int
        Car num2 = new Car(); // we have created another object of the same class and changing the value of the variable without affecting the original value of the variable int
        num2.lambo = 2;
      
        System.out.println("I owned lamborgini "+num1.lambo); // this print the original value 
        System.out.println("no you owned "+num2.lambo+" lamborgini"); // chaning the original without affecting the original value
        System.out.println("I owned ferari "+num1.ferari);
        System.out.println("I have a car name " +num1.auto);
        
        Solving result = new Solving();
        int r = result.Addition();
        
        System.out.println(r);
        
        
        
        
        
        
        
       
    }
}
