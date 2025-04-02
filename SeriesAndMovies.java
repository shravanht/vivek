public class SeriesAndMovies {
    public static void main(String[] args) {
       
        String[] hindiSeries = {
            "Sacred Games", 
            "Mirzapur", 
            "Kashmir Files", 
            "Paatal Lok", 
            "The Family Man", 
            "Tumbbad", 
            "Made in Heaven", 
            "Delhi Crime", 
            "The Test Case", 
            "Breathe"
        };

       
        String[] kannadaSeries = {
            "Kgf", 
            "Charlie 777", 
            "Vikrant Rona", 
            "Kaatera", 
            "kantara", 
            "Bigg Boss Kannada", 
            "The Breaking Point", 
            "Satyam Shivam Sundaram", 
            "Sarkari Hi. Pra. Shastra", 
            "Chandanavana"
        };

        
        String[] malayalamMovies = {
            "Drishyam", 
            "Kumbalangi Nights", 
            "Premam", 
            "C U Soon", 
            "The Great Indian Kitchen", 
            "Virus", 
            "Bangalore Days", 
            "Angamaly Diaries", 
            "Uyare", 
            "Manichitrathazhu"
        };

        
        String[] englishSeries = {
            "Breaking Bad", 
            "Stranger Things", 
            "Game of Thrones", 
            "Friends", 
            "The Office", 
            "Black Mirror", 
            "Sherlock", 
            "The Crown", 
            "Westworld", 
            "Money Heist"
        };

        
        System.out.println("Hindi Series:");
        for (String series : hindiSeries) {
            System.out.println(series);
        }

        System.out.println("\nKannada Series:");
        for (String series : kannadaSeries) {
            System.out.println(series);
        }

        System.out.println("\nMalayalam Movies:");
        for (String movie : malayalamMovies) {
            System.out.println(movie);
        }

        System.out.println("\nEnglish Series:");
        for (String series : englishSeries) {
            System.out.println(series);
        }
    }
}
