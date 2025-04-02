public class MovieStore {

    // 1. Kannada Movies
    static String kannadaMovies[] = {
        "KGF: Chapter 1", "KGF: Chapter 2", "Kirik Party", "RangiTaranga", 
        "Lucia", "Jeeva", "Ulidavaru Kandanthe", "Thithi", 
        "Raajakumara", "Bell Bottom"
    };

    // 2. Hindi Movies
    static String hindiMovies[] = {
        "Gully Boy", "Dangal", "Lagaan", "Zindagi Na Milegi Dobara", 
        "Kabhi Khushi Kabhie Gham", "PK", "3 Idiots", "Sholay", 
        "Jab We Met", "Tanu Weds Manu"
    };

    // 3. Telugu Movies
    static String teluguMovies[] = {
        "Baahubali: The Beginning", "Baahubali: The Conclusion", "RRR", "Magadheera", 
        "Ala Vaikunthapurramuloo", "Pushpa", "Srimanthudu", "Arjun Reddy", 
        "Eega", "Maharshi"
    };

    // 4. Tamil Movies
    static String tamilMovies[] = {
        "Enthiran", "Baasha", "Visaranai", "Kaaka Muttai", 
        "Vikram", "Mersal", "Super Deluxe", "Kaithi", 
        "Master", "Anniyan"
    };

    // 5. Malayalam Movies
    static String malayalamMovies[] = {
        "Drishyam", "Premam", "Kumbalangi Nights", "Angamaly Diaries", 
        "Bangalore Days", "Ustaad Hotel", "Charlie", "Manichitrathazhu", 
        "Virus", "Super Deluxe"
    };

    public static void main(String[] args) {
        movieList();
    }

    public static void movieList() {

        System.out.println("Total number of Kannada Movies: " + kannadaMovies.length);
        System.out.println("List of Kannada Movies available are: ");
        for (String movie : kannadaMovies) {
            System.out.print(movie + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Hindi Movies: " + hindiMovies.length);
        System.out.println("List of Hindi Movies available are: ");
        for (String movie : hindiMovies) {
            System.out.print(movie + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Telugu Movies: " + teluguMovies.length);
        System.out.println("List of Telugu Movies available are: ");
        for (String movie : teluguMovies) {
            System.out.print(movie + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Tamil Movies: " + tamilMovies.length);
        System.out.println("List of Tamil Movies available are: ");
        for (String movie : tamilMovies) {
            System.out.print(movie + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Malayalam Movies: " + malayalamMovies.length);
        System.out.println("List of Malayalam Movies available are: ");
        for (String movie : malayalamMovies) {
            System.out.print(movie + ", ");
        }
        System.out.println("\n");

    }
}