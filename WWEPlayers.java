public class WWEPlayers {

    // 1. Legends
    static String legends[] = {
        "Hulk Hogan", "Stone Cold Steve Austin", "The Rock", "The Undertaker",
        "Ric Flair", "Shawn Michaels", "Triple H", "Bret Hart",
        "Randy Savage", "Kurt Angle"
    };

    // 2. Current Superstars
    static String currentSuperstars[] = {
        "Roman Reigns", "Seth Rollins", "Brock Lesnar", "Becky Lynch",
        "Charlotte Flair", "Drew McIntyre", "Riddle", "Bianca Belair",
        "Kevin Owens", "Finn Balor"
    };

    // 3. Tag Teams
    static String tagTeams[] = {
        "The Usos", "The New Day", "The Street Profits", "The Viking Raiders",
        "RK-Bro", "Alpha Academy", "The Hurt Business", "Imperium",
        "The Bludgeon Brothers", "The Bar"
    };

    // 4. Women's Wrestlers
    static String womenWrestlers[] = {
        "Trish Stratus", "Lita", "Asuka", "Alexa Bliss",
        "Bayley", "Sasha Banks", "Nia Jax", "Ronda Rousey",
        "Mickie James", "Tamina"
    };

    // 5. Hall of Fame
    static String hallOfFame[] = {
        "Stone Cold Steve Austin", "The Rock", "Hulk Hogan", "Bret Hart",
        "Shawn Michaels", "Ric Flair", "The Undertaker", "Dusty Rhodes",
        "Eddie Guerrero", "Ultimate Warrior"
    };

    public static void main(String[] args) {
        playersList();
    }

    public static void playersList() {

        System.out.println("Total number of Legends: " + legends.length);
        System.out.println("List of WWE Legends are: ");
        for (String player : legends) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Current Superstars: " + currentSuperstars.length);
        System.out.println("List of Current WWE Superstars are: ");
        for (String player : currentSuperstars) {
            System.out.print(player + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Tag Teams: " + tagTeams.length);
        System.out.println("List of WWE Tag Teams are: ");
        for (String team : tagTeams) {
            System.out.print(team + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Women Wrestlers: " + womenWrestlers.length);
        System.out.println("List of WWE Women Wrestlers are: ");
        for (String wrestler : womenWrestlers) {
            System.out.print(wrestler + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Hall of Fame inductees: " + hallOfFame.length);
        System.out.println("List of WWE Hall of Fame inductees are: ");
        for (String inductee : hallOfFame) {
            System.out.print(inductee + ", ");
        }
        System.out.println("\n");

    }
}