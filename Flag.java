class Flag {
    String country;
    String material;
    double height;
    double width;
    String color;
    String symbol;

    Flag() {
        this("USA");  
        System.out.println("Constructor 1: No parameters");
    }

    Flag(String country) {
        this(country, "Polyester");  
        System.out.println("Constructor 2: Country initialized");
    }

    Flag(String country, String material) {
        this(country, material, 1.0, 1.5);  
        System.out.println("Constructor 3: Country and Material initialized");
    }

    Flag(String country, String material, double height, double width) {
        this(country, material, height, width, "Red");  
        System.out.println("Constructor 4: Country, Material, Height, and Width initialized");
    }

    Flag(String country, String material, double height, double width, String color) {
        this(country, material, height, width, color, "Stars and Stripes");  
        System.out.println("Constructor 5: Country, Material, Height, Width, and Color initialized");
    }

    Flag(String country, String material, double height, double width, String color, String symbol) {
        this.country = country;
        this.material = material;
        this.height = height;
        this.width = width;
        this.color = color;
        this.symbol = symbol;
        System.out.println("Constructor 6: All variables initialized");
    }

    void display() {
        System.out.println("Country: " + country + ", Material: " + material + ", Height: " + height + "m, Width: " + width + "m, Color: " + color + ", Symbol: " + symbol);
    }
}
