public class CricketTeam {

    // 1. Batsmen
    static String batsmen[] = {
        "Virat Kohli", "Steve Smith", "Joe Root", "Kane Williamson", 
        "Rohit Sharma", "Shikhar Dhawan", "David Warner", "Marnus Labuschagne", 
        "Babar Azam", "Jonny Bairstow"
    };

    // 2. Bowlers
    static String bowlers[] = {
        "Jasprit Bumrah", "Mitchell Starc", "Pat Cummins", "Shaheen Afridi", 
        "Rashid Khan", "Kagiso Rabada", "Mohammad Shami", "Josh Hazlewood", 
        "Trent Boult", "Yuzvendra Chahal"
    };

    // 3. All-Rounders
    static String allRounders[] = {
        "Ben Stokes", "Hardik Pandya", "Shakib Al Hasan", "Kyle Jamieson", 
        "Chris Woakes", "Marcus Stoinis", "Glenn Maxwell", "Ravindra Jadeja", 
        "Andre Russell", "David Willey"
    };

    // 4. Wicketkeepers
    static String wicketkeepers[] = {
        "MS Dhoni", "Jos Buttler", "Quinton de Kock", "Kane Williamson", 
        "Jonny Bairstow", "Rishabh Pant", "Tom Latham", "David Warner", 
        "Shai Hope", "KL Rahul"
    };

    public static void main(String[] args) {
        playersList();
    }

    public static void playersList() {
        // Batsmen
        System.out.println("Total number of Batsmen: " + batsmen.length);
        System.out.println("List of Batsmen in the team: ");
        for (String player : batsmen) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");

        // Bowlers
        System.out.println("Total number of Bowlers: " + bowlers.length);
        System.out.println("List of Bowlers in the team: ");
        for (String player : bowlers) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");

        // All-Rounders
        System.out.println("Total number of All-Rounders: " + allRounders.length);
        System.out.println("List of All-Rounders in the team: ");
        for (String player : allRounders) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");

        // Wicketkeepers
        System.out.println("Total number of Wicketkeepers: " + wicketkeepers.length);
        System.out.println("List of Wicketkeepers in the team: ");
        for (String player : wicketkeepers) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");
    }
}
