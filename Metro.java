class Metro {
    String line;
    int stations;
    String color;
    String city;
    double ticketPrice;
    int trainFrequency;

    Metro() {
        this("Red");  
        System.out.println("Constructor 1: No parameters");
    }

    Metro(String line) {
        this(line, 10);  
        System.out.println("Constructor 2: Line initialized");
    }

    Metro(String line, int stations) {
        this(line, stations, "Blue"); 
        System.out.println("Constructor 3: Line and Stations initialized");
    }

    Metro(String line, int stations, String color) {
        this(line, stations, color, "New York");  
        System.out.println("Constructor 4: Line, Stations, and Color initialized");
    }

    Metro(String line, int stations, String color, String city) {
        this(line, stations, color, city, 20.0);  
        System.out.println("Constructor 5: Line, Stations, Color, and City initialized");
    }

    Metro(String line, int stations, String color, String city, double ticketPrice) {
        this(line, stations, color, city, ticketPrice, 5); 
        System.out.println("Constructor 6: Line, Stations, Color, City, and Ticket Price initialized");
    }

    Metro(String line, int stations, String color, String city, double ticketPrice, int trainFrequency) {
        this.line = line;
        this.stations = stations;
        this.color = color;
        this.city = city;
        this.ticketPrice = ticketPrice;
        this.trainFrequency = trainFrequency;
        System.out.println("Constructor 7: All variables initialized");
    }

    void display() {
        System.out.println("Line: " + line + ", Stations: " + stations + ", Color: " + color +
                ", City: " + city + ", Ticket Price: Rs" + ticketPrice + ", Train Frequency: " + trainFrequency + " min");
    }
}
