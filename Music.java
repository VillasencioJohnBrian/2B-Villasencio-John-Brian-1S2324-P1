import java.util.Scanner;


public class Music {
    
    
     private int id;
     private String title, genre, artist;
    
  
    Music(int id) {
        
       
        this.id = id;
        this.title = "";
        this.genre = "";
        this.artist = "";
      
    
    }
 
  
      

    
    protected void setId(int id) {
        this.id = id;
       
    }
   protected void setTitle(String title) {
        this.title = title;
    } 

    protected void setGenre(String genre) {
        this.genre = genre;
    }
    protected void setArtist(String artist) {
        this.artist = artist;
      
    }  


    
    public void dis() {
       
       
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = input.nextInt();
        System.out.print("Title: ");
        this.title = input.next();
        System.out.print("Genre: ");
        this.genre = input.next();
        System.out.print("Artist: ");
        this.artist = input.next();
        System.out.println("");
        
        
        
       
    
          
      
       
    }
       
 
    
} 