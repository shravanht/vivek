class Weapon {

    String type;
    String material;
    double weight;
    double length;
    String color;
    String design;

    Weapon() {
        this("Sword");  
        System.out.println("Constructor 1: No parameters");
    }

    Weapon(String type) {
        this(type, "Steel");  
        System.out.println("Constructor 2: Type initialized");
    }

    Weapon(String type, String material) {
        this(type, material, 3.0, 100.0);  
        System.out.println("Constructor 3: Type and Material initialized");
    }

    Weapon(String type, String material, double weight, double length) {
        this(type, material, weight, length, "Silver");  
        System.out.println("Constructor 4: Type, Material, Weight, and Length initialized");
    }

    Weapon(String type, String material, double weight, double length, String color) {
        this(type, material, weight, length, color, "Classic"); 
        System.out.println("Constructor 5: Type, Material, Weight, Length, and Color initialized");
    }

    Weapon(String type, String material, double weight, double length, String color, String design) {
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.color = color;
        this.design = design;
        System.out.println("Constructor 6: All variables initialized");
    }

    void display() {
        System.out.println("Type: " + type + ", Material: " + material + ", Weight: " + weight + "kg, Length: " + length + "cm, Color: " + color + ", Design: " + design);
    }
}
