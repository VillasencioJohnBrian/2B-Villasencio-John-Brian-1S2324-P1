import java.util.Scanner;


public class RunMusic {







    public static void main(String[] args) {
        // TODO code application logic here



        int i;

        Scanner input = new Scanner(System.in); 
        System.out.print("How many music do you want to create: ");
        int num = input.nextInt();
        System.out.println("");
        Music[] music = new Music[num];




        for (i = 0; i < music.length; i++) {

           music[i] = new Music(i + 1);
           //music[i].dis();


           if (music[i] == music[i]) {
               music[i].dis();      

           }


        } 



       if (num == 0) {

           System.out.println("Music Creation failed!");


       } else if (num != 0) {


           System.out.println("Congratulations you have successfully created "+num+" Music!");


       }





    }

}