class Road {

    String type;
    String material;
    double length;
    double width;
    String color;
    String design;

    Road() {
        this("Highway");  
        System.out.println("Constructor 1: No parameters");
    }

    Road(String type) {
        this(type, "Asphalt");  
        System.out.println("Constructor 2: Type initialized");
    }

    Road(String type, String material) {
        this(type, material, 5000.0, 10.0);  
        System.out.println("Constructor 3: Type and Material initialized");
    }

    Road(String type, String material, double length, double width) {
        this(type, material, length, width, "Gray");  
        System.out.println("Constructor 4: Type, Material, Length, and Width initialized");
    }

    Road(String type, String material, double length, double width, String color) {
        this(type, material, length, width, color, "Straight");  
        System.out.println("Constructor 5: Type, Material, Length, Width, and Color initialized");
    }

    Road(String type, String material, double length, double width, String color, String design) {
        this.type = type;
        this.material = material;
        this.length = length;
        this.width = width;
        this.color = color;
        this.design = design;
        System.out.println("Constructor 6: All variables initialized");
    }
    void display() {
        System.out.println("Type: " + type + ", Material: " + material + ", Length: " + length + "m, Width: " + width + "m, Color: " + color + ", Design: " + design);
    }
}
