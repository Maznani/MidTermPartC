/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testuserprofile;

import java.util.Scanner;

/**
 *
 * @author aliibrahim
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Display the list of possible genres
        String[] genres = {"Action", "Comedy", "Drama", "Horror", "Romance", "Sci-Fi", "Thriller"};
        System.out.println("Choose your favorite genre from the list:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }
        
        // Get user's name and chosen genre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of your chosen genre: ");
        int genreIndex = scanner.nextInt();
        String genre = genres[genreIndex-1];
        
        // Create user profile and display message
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your user profile was created.");
    }
}

class UserProfile {
    
    private String name;
    private String favoriteGenre;
    
    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
    
    public String getName() {
        return name;
    }
    
    public String getFavoriteGenre() {
        return favoriteGenre;
    }
}


}
    
}
