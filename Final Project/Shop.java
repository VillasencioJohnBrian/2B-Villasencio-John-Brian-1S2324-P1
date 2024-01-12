import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        String name;
        String choice;
        double n;

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("Anna");
        Customer customer = new Customer("");
        Laptop laptop = new Laptop("Laptop");
        MobilePhone mobilePhone = new MobilePhone("Mobile Phone");
        Tv tv = new Tv("Tv");
      
        System.out.println("Hi, my name is "+employee.getName()+" and i will be your assistant for you today.");
        System.out.print("Please Enter your Customer name: ");
        customer.setName(name = scanner.nextLine());
        System.out.println();
        System.out.print(customer.getName()+", would you like to continue shopping? (yes/no): ");
        choice = scanner.nextLine();
        if (choice.equals("yes")) {
            System.out.println("Below is the only available product in our store.");
            System.out.println();
            
            laptop.displayProducts();
            mobilePhone.displayProducts();
            tv.displayProducts();

            System.out.println();
            System.out.print("Please enter the product name to see the available brands: ");
            choice = scanner.nextLine();
            
            if (choice.equals(laptop.getProduct())) {
                
                Apple apple = new Apple("");
                apple.setBrand("Apple");
                apple.setPrice(2000);
                Acer acer = new Acer("");
                acer.setBrand("Acer");
                acer.setPrice(500);
                Lenovo lenovo = new Lenovo("");
                lenovo.setBrand("Lenovo");
                lenovo.setPrice(900);

                //laptop.setBrand("Apple"); 
                System.out.println();
                System.out.println("Here are the availabe brand of "+laptop.getProduct()+" with the price.");
                System.out.println();
                apple.displayBrand();
                acer.displayBrand();
                lenovo.displayBrand();
                System.out.println();
                System.out.print("Enter the item that you want to buy: ");
                choice = scanner.nextLine();
                if (choice.equals(apple.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+laptop.getProduct()+" "+apple.getBrand()+" with the amount of $"+apple.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == apple.getPrice() ) {
            
                                double sum = n - apple.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+apple.getBrand());
                                
                            }
                            else if (n > apple.getPrice()) {
                                double sum = n - apple.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+apple.getBrand());
                              
                                System.out.println("Here is your change $"+sum);

                            

                            }
                            else if (n < apple.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                } else if (choice.equals(acer.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+laptop.getProduct()+" "+acer.getBrand()+" with the amount of $"+acer.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == acer.getPrice() ) {
            
                                double sum = n - acer.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+acer.getBrand());
                                
                            }
                            else if (n > acer.getPrice()) {
                                double sum = n - acer.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+acer.getBrand());
                                System.out.println("Here is your change $"+sum);

                            }
                            else if (n < acer.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                } else if (choice.equals(lenovo.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+laptop.getProduct()+" "+lenovo.getBrand()+" with the amount of $"+lenovo.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == lenovo.getPrice() ) {
            
                                double sum = n - acer.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+lenovo.getBrand());
                                
                            }
                            else if (n > lenovo.getPrice()) {
                                double sum = n - lenovo.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+laptop.getProduct()+" "+lenovo.getBrand());
                                System.out.println("Here is your change $"+sum);
                               
                               
                            }
                            else if (n < lenovo.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                }
                


            } else if (choice.equals(mobilePhone.getProduct())) {
                Iphone iphone = new Iphone("");
                iphone.setBrand("Iphone");
                iphone.setPrice(400);
                Vivo vivo = new Vivo("");
                vivo.setBrand("Vivo");
                vivo.setPrice(200);
                Samsung samsung = new Samsung("");
                samsung.setBrand("Samsung");
                samsung.setPrice(150);

                //laptop.setBrand("Apple"); 
                System.out.println();
                System.out.println("Here are the availabe brand of "+mobilePhone.getProduct()+" with the price.");
                System.out.println();
                iphone.displayBrand();
                vivo.displayBrand();
                samsung.displayBrand();
                System.out.println();
                System.out.print("Enter the item that you want to buy: ");
                choice = scanner.nextLine();
                if (choice.equals(iphone.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+mobilePhone.getProduct()+" "+iphone.getBrand()+" with the amount of $"+iphone.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == iphone.getPrice() ) {
            
                                double sum = n - iphone.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+iphone.getBrand());
                                
                            }
                            else if (n > iphone.getPrice()) {
                                double sum = n - iphone.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+iphone.getBrand());
                            
                                System.out.println("Here is your change $"+sum);


                            }
                            else if (n < iphone.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                }  else if (choice.equals(vivo.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+mobilePhone.getProduct()+" "+vivo.getBrand()+" with the amount of $"+vivo.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == vivo.getPrice() ) {
            
                                double sum = n - vivo.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+vivo.getBrand());
                                
                            }
                            else if (n > vivo.getPrice()) {
                                double sum = n - vivo.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+vivo.getBrand());
                        
                                System.out.println("Here is your change $"+sum);


                            }
                            else if (n < vivo.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                } else if (choice.equals(samsung.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+mobilePhone.getProduct()+" "+samsung.getBrand()+" with the amount of $"+samsung.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == samsung.getPrice() ) {
            
                                double sum = n - vivo.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+samsung.getBrand());
                                
                            } 
                            else if (n > samsung.getPrice()) {
                                double sum = n - samsung.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+mobilePhone.getProduct()+" "+samsung.getBrand());
                              
                                System.out.println("Here is your change $"+sum);


                            }
                            else if (n < vivo.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                }
                    

// code hrere

            } else if (choice.equals(tv.getProduct())) {
                LG lg= new LG("");
                lg.setBrand("LG");
                lg.setPrice(900);
                Hisense hisense = new Hisense("");
                hisense.setBrand("Hisense");
                hisense.setPrice(1200);
                Sony sony = new Sony("");
                sony.setBrand("Sony");
                sony.setPrice(1500);

                //laptop.setBrand("Apple"); 
                System.out.println();
                System.out.println("Here are the availabe brand of "+tv.getProduct()+" with the price.");
                System.out.println();
                lg.displayBrand();
                hisense.displayBrand();
                sony.displayBrand();
                System.out.println();
                System.out.print("Enter the item that you want to buy: ");
                choice = scanner.nextLine();
                if (choice.equals(lg.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+tv.getProduct()+" "+lg.getBrand()+" with the amount of $"+lg.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == lg.getPrice() ) {
            
                                double sum = n - lg.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+lg.getBrand());
                                
                            } 
                            else if (n > lg.getPrice()) {
                                double sum = n - lg.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+lg.getBrand());
                                System.out.print("Do you want to claim your change (yes/no): ");
                                
                                System.out.println("Here is your change $"+sum);

                              
                            }
                            else if (n < lg.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                }  else if (choice.equals(hisense.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+tv.getProduct()+" "+hisense.getBrand()+" with the amount of $"+hisense.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == hisense.getPrice() ) {
            
                                double sum = n - hisense.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+hisense.getBrand());
                                
                            }
                            else if (n > hisense.getPrice()) {
                                double sum = n - hisense.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+hisense.getBrand());
                              
                                System.out.println("Here is your change $"+sum);

                            

                            }
                            else if (n < hisense.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                    

                } else if (choice.equals(sony.getBrand())) {
                    System.out.println(); 
                    System.out.println("Are you sure that you want to buy this "+tv.getProduct()+" "+sony.getBrand()+" with the amount of $"+sony.getPrice()+" Dollar.");
                    System.out.print("Enter (yes/no): ");
                    choice = scanner.nextLine();
                    if (choice.equals("yes")) {
                        //System.out.println("Congratulations "+customer.getName()+" you can now received "+laptop.getProduct()+" "+apple.getBrand());
                        System.out.println();
                        System.out.println("Do you want to proceed to pay?");
                        System.out.print("Enter (yes/no): ");
                        choice = scanner.nextLine();
                        if (choice.equals("yes")) {

                            System.out.println();
                            System.out.print("Enter money: ");
                            n = scanner.nextDouble();

                            if (n == sony.getPrice() ) {
            
                                double sum = n - sony.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+sony.getBrand());
                                
                            } 
                            else if (n > sony.getPrice()){
                                double sum = n - sony.getPrice();
                                System.out.println(customer.getName()+", Thank you for purchasing "+tv.getProduct()+" "+sony.getBrand());
                               
                                System.out.println("Here is your change $"+sum);


                            }
                            else if (n < sony.getPrice()) {
                                System.out.println("Dear, "+customer.getName()+" Sorry to inform you but you dont have enough money to proceed.");
                               
                            }
                        } else {
                            System.out.println("Thank you for visiting our shop!");

                        }

                    }
                    else  {
                        System.out.println("Thank you for visiting our shop!");


                    }
                }
                    



            } 
                    

           
            
        }
        else {
            System.out.println("Thank you for visiting our shop!");
        }


      

        
    }
}