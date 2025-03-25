class Glass {
    
    String type;
    String material;
    double height;
    double width;
    String color;
    String pattern;

    
    Glass() {
        this("Standard Glass");  
        System.out.println("Constructor 1: No parameters");
    }

   
    Glass(String type) {
        this(type, "Glass"); 
        System.out.println("Constructor 2: Type initialized");
    }

    Glass(String type, String material) {
        this(type, material, 10.0, 5.0);  
        System.out.println("Constructor 3: Type and Material initialized");
    }

    Glass(String type, String material, double height, double width) {
        this(type, material, height, width, "Clear"); 
        System.out.println("Constructor 4: Type, Material, Height, and Width initialized");
    }

    Glass(String type, String material, double height, double width, String color) {
        this(type, material, height, width, color, "Plain");  
        System.out.println("Constructor 5: Type, Material, Height, Width, and Color initialized");
    }

    Glass(String type, String material, double height, double width, String color, String pattern) {
        this.type = type;
        this.material = material;
        this.height = height;
        this.width = width;
        this.color = color;
        this.pattern = pattern;
        System.out.println("Constructor 6: All variables initialized");
    }
	
    void display() {
        System.out.println("Type: " + type + ", Material: " + material + ", Height: " + height + "cm, Width: " + width + "cm, Color: " + color + ", Pattern: " + pattern);
    }
}
