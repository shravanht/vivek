class Chemical {

    String name;
    String formula;
    double boilingPoint;
    double meltingPoint;
    String color;
    String state;

    Chemical() {
        this("Unknown Chemical");
        System.out.println("Constructor 1: No parameters");
    }

    Chemical(String name) {
        this(name, "Unknown Formula");
        System.out.println("Constructor 2: Name initialized");
    }

    Chemical(String name, String formula) {
        this(name, formula, 100.0, 0.0); 
        System.out.println("Constructor 3: Name and Formula initialized");
    }

    Chemical(String name, String formula, double boilingPoint, double meltingPoint) {
        this(name, formula, boilingPoint, meltingPoint, "Colorless");
        System.out.println("Constructor 4: Name, Formula, BoilingPoint, and MeltingPoint initialized");
    }

    Chemical(String name, String formula, double boilingPoint, double meltingPoint, String color) {
        this(name, formula, boilingPoint, meltingPoint, color, "Solid");
        System.out.println("Constructor 5: Name, Formula, BoilingPoint, MeltingPoint, and Color initialized");
    }

    Chemical(String name, String formula, double boilingPoint, double meltingPoint, String color, String state) {
        this.name = name;
        this.formula = formula;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.color = color;
        this.state = state;
        System.out.println("Constructor 6: All variables initialized");
    }

    void display() {
        System.out.println("Name: " + name + ", Formula: " + formula + ", Boiling Point: " + boilingPoint + "°C, Melting Point: " + meltingPoint + "°C, Color: " + color + ", State: " + state);
    }
}
