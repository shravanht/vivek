public class ShoeStore {




         // 1. Sports Shoes
       static   String sportsShoes[] = {
            "Running Shoes", "Basketball Shoes", "Football Cleats", "Tennis Shoes", 
            "Hiking Boots", "Soccer Shoes", "Cross-Trainers", "Trail Running Shoes", 
            "Skateboarding Shoes", "Cycling Shoes"
        };

            // 2. Casual Shoes
          static  String casualShoes[] = {
                "Loafers", "Moccasins", "Sneakers", "Boat Shoes", 
                "Slip-Ons", "Canvas Shoes", "Espadrilles", "Flats", 
                "Ballet Flats", "Casual Sandals"
            };

                // 3. Formal Shoes
            static String formalShoes[] = {
                "Oxfords", "Brogues", "Derby Shoes", "Monk Straps", 
                "Loafers (Dress Style)", "Chelsea Boots", "Dress Boots", "Wingtip Shoes", 
                "Leather Loafers", "Pointed Shoes"
            };

            
            // 4. Boots
            static   String boots[] = {
                "Ankle Boots", "Chelsea Boots", "Work Boots", "Hiking Boots", 
                "Combat Boots", "Wellington Boots", "Cowboy Boots", "Snow Boots", 
                "Riding Boots", "Chukka Boots"
            };

                // 5. Sandals & Flip Flops
                static  String sandals[] = {
                "Gladiator Sandals", "Slides", "Flip-Flops", "Cork Sandals", 
                "Hiking Sandals", "Sports Sandals", "Fisherman Sandals", "Wedge Sandals", 
                "Beach Sandals", "Thong Sandals"
            };

    public static void main(String[] args) {

      shoesList();
    
  
    }

    
    public static void shoesList(){
      
        System.out.println("Total number of Sports Shoes: " + sportsShoes.length);
        System.out.println("List of Sports Shoes available are: ");
        for (String shoe : sportsShoes) {
            System.out.print(shoe + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Casual Shoes: " + casualShoes.length);
        System.out.println("List of Casual Shoes available are: ");
        for (String shoe : casualShoes) {
            System.out.print(shoe + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Formal Shoes: " + formalShoes.length);
        System.out.println("List of Formal Shoes available are: ");
        for (String shoe : formalShoes) {
            System.out.print(shoe + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Boots: " + boots.length);
        System.out.println("List of Boots available are: ");
        for (String shoe : boots) {
            System.out.print(shoe + ", ");
        }
        System.out.println("\n");

    
        System.out.println("Total number of Sandals & Flip Flops: " + sandals.length);
        System.out.println("List of Sandals & Flip Flops available are: ");
        for (String shoe : sandals) {
            System.out.print(shoe + ", ");
        }
        System.out.println("\n");
    
    }
}