package objects;

class Movie {
    // * these are instance variables 
    String title;
    String genre;
    int rating;

    // * methods
    void playIt() {
        System.out.println("Movie playing....");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        // * this is how an obj is created 
        Movie one = new Movie();
        one.title = "Demon Slayer";
        one.genre = "Anime";
        one.rating = 4;

        Movie two = new Movie();
        two.title = "Shutter Island";
        two.genre = "Pshycological";
        two.rating = 4;
    }
}
