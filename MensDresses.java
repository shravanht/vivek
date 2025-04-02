public class MensDresses {

    // 1. Casual Wear
    static String casualWear[] = {
        "T-Shirts", "Jeans", "Casual Shirts", "Polo Shirts",
        "Chinos", "Shorts", "Hoodies", "Sweatshirts", 
        "Casual Jackets", "Flip-Flops"
    };

    // 2. Formal Wear
    static String formalWear[] = {
        "Suits", "Dress Shirts", "Ties", "Blazers", 
        "Tuxedos", "Dress Pants", "Dress Shoes", 
        "Vests", "Cufflinks", "Overcoats"
    };

    // 3. Sportswear
    static String sportsWear[] = {
        "Track Pants", "Sports T-Shirts", "Jogging Suits", 
        "Athletic Shorts", "Sweatpants", "Running Shoes", 
        "Compression Gear", "Sports Jackets", "Gym Shorts"
    };

    // 4. Outerwear
    static String outerwear[] = {
        "Coats", "Parkas", "Leather Jackets", "Trench Coats",
        "Bomber Jackets", "Puffer Jackets", "Windbreakers", 
        "Denim Jackets", "Peacoats", "Raincoats"
    };

    // 5. Traditional Wear
    static String traditionalWear[] = {
        "Suits", "Kurta", "Sherwani", "Dhoti", 
        "Jodhpuri Suit", "Achkan", "Lungi", "Pathani Suit"
    };

    public static void main(String[] args) {
        dressesList();
    }

    public static void dressesList() {
        printDressCategory("Casual Wear", casualWear);
        printDressCategory("Formal Wear", formalWear);
        printDressCategory("Sportswear", sportsWear);
        printDressCategory("Outerwear", outerwear);
        printDressCategory("Traditional Wear", traditionalWear);
    }

    // Helper function to print dress categories
    public static void printDressCategory(String categoryName, String[] dresses) {
        System.out.println("Total number of " + categoryName + ": " + dresses.length);
        System.out.print("List of " + categoryName + " available are: ");
        
        for (int i = 0; i < dresses.length; i++) {
            System.out.print(dresses[i]);
            if (i < dresses.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\n");
    }
}