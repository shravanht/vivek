class Fresh {

    
    String[] groceries = new String[10];
    String[] perfumes = new String[10];
    String[] biscuits = new String[10];
    String[] utensils = new String[10];
    String[] vegetables = new String[10];

   
    public Fresh() {
        
        for (int i = 0; i < 10; i++) {
            groceries[i] = "Grocery Item " + (i + 1);
            perfumes[i] = "Perfume " + (i + 1);
            biscuits[i] = "Biscuit " + (i + 1);
            utensils[i] = "Utensil " + (i + 1);
            vegetables[i] = "Vegetable " + (i + 1);
        }
    }

    
    public void printItems() {
        System.out.println("Groceries:");
        for (String item : groceries) {
            System.out.println(item);
        }

        System.out.println("\nPerfumes:");
        for (String item : perfumes) {
            System.out.println(item);
        }

        System.out.println("\nBiscuits:");
        for (String item : biscuits) {
            System.out.println(item);
        }

        System.out.println("\nUtensils:");
        for (String item : utensils) {
            System.out.println(item);
        }

        System.out.println("\nVegetables:");
        for (String item : vegetables) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
      
        Fresh Fresh = new Fresh();
        
        Fresh.printItems();
    }
}