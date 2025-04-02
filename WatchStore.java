public class WatchStore {

    // 1. Sports Watches
    static String sportsWatches[] = {
        "Dive Watch", "Pilot Watch", "Field Watch", "Chronograph", 
        "Digital Watch", "Smartwatch", "Racing Watch", "Triathlon Watch", 
        "Altimeter Watch", "Multi-sport Watch"
    };

    // 2. Luxury Watches
    static String luxuryWatches[] = {
        "Rolex Submariner", "Patek Philippe Calatrava", "Audemars Piguet Royal Oak", "Omega Seamaster", 
        "Vacheron Constantin Overseas", "Jaeger-LeCoultre Reverso", "Tag Heuer Monaco", "IWC Big Pilot", 
        "Breitling Navitimer", "Cartier Tank"
    };

    // 3. Casual Watches
    static String casualWatches[] = {
        "Leather Strap Watch", "Metal Strap Watch", "Fabric Strap Watch", "Quartz Watch", 
        "Minimalist Watch", "Automatic Watch", "Wooden Watch", "Vintage Watch", 
        "Travel Watch", "Sports Casual Watch"
    };

    // 4. Fashion Watches
    static String fashionWatches[] = {
        "Gold Watch", "Silver Watch", "Rose Gold Watch", "Diamond Watch", 
        "Bangle Watch", "Pearl Watch", "Heart Shape Watch", "Colorful Strap Watch", 
        "Oversized Watch", "Slim Watch"
    };

    // 5. Smartwatches
    static String smartWatches[] = {
        "Apple Watch Series", "Samsung Galaxy Watch", "Garmin Forerunner", "Fitbit Versa", 
        "Amazfit GTR", "Huawei Watch GT", "Oppo Watch", "Xiaomi Mi Watch", 
        "Suunto 7", "Withings Steel HR"
    };

    public static void main(String[] args) {
        watchesList();
    }

    public static void watchesList() {

        System.out.println("Total number of Sports Watches: " + sportsWatches.length);
        System.out.println("List of Sports Watches available are: ");
        for (String watch : sportsWatches) {
            System.out.print(watch + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Luxury Watches: " + luxuryWatches.length);
        System.out.println("List of Luxury Watches available are: ");
        for (String watch : luxuryWatches) {
            System.out.print(watch + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Casual Watches: " + casualWatches.length);
        System.out.println("List of Casual Watches available are: ");
        for (String watch : casualWatches) {
            System.out.print(watch + ", ");
        }
        System.out.println("\n");
    }
}