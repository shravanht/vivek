class Wire {
    String type;
    double length;
    String material;
    String color;
    double price;
    int thickness;

    Wire() {
        this("Copper");
        System.out.println("Constructor 1: No parameters");
    }

    Wire(String type) {
        this(type, 10.0);
        System.out.println("Constructor 2: Type initialized");
    }

    Wire(String type, double length) {
        this(type, length, "Copper");
        System.out.println("Constructor 3: Type and Length initialized");
    }

    Wire(String type, double length, String material) {
        this(type, length, material, "Silver");
        System.out.println("Constructor 4: Type, Length, and Material initialized");
    }

    Wire(String type, double length, String material, String color) {
        this(type, length, material, color, 100.0);
        System.out.println("Constructor 5: Type, Length, Material, and Color initialized");
    }

    Wire(String type, double length, String material, String color, double price) {
        this(type, length, material, color, price, 10);
        System.out.println("Constructor 6: Type, Length, Material, Color, and Price initialized");
    }

    Wire(String type, double length, String material, String color, double price, int thickness) {
        this.type = type;
        this.length = length;
        this.material = material;
        this.color = color;
        this.price = price;
        this.thickness = thickness;
        System.out.println("Constructor 7: All variables initialized");
    }

    void display() {
        System.out.println("Type: " + type + ", Length: " + length + " meters, Material: " + material +
                ", Color: " + color + ", Price: Rs" + price + ", Thickness: " + thickness);
    }
}
