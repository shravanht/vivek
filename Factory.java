class Factory {

    String name;
    String location;
    int numberOfWorkers;
    int numberOfMachines;
    String productType;
    String operationType;

    Factory() {
        this("Generic Factory");  
        System.out.println("Constructor 1: No parameters");
    }

    Factory(String name) {
        this(name, "Unknown Location");  
        System.out.println("Constructor 2: Name initialized");
    }

    Factory(String name, String location) {
        this(name, location, 100, 50);  
        System.out.println("Constructor 3: Name and Location initialized");
    }

    Factory(String name, String location, int numberOfWorkers, int numberOfMachines) {
        this(name, location, numberOfWorkers, numberOfMachines, "Electronics"); 
        System.out.println("Constructor 4: Name, Location, Workers, and Machines initialized");
    }

    Factory(String name, String location, int numberOfWorkers, int numberOfMachines, String productType) {
        this(name, location, numberOfWorkers, numberOfMachines, productType, "Automated");  
        System.out.println("Constructor 5: Name, Location, Workers, Machines, and Product Type initialized");
    }

    Factory(String name, String location, int numberOfWorkers, int numberOfMachines, String productType, String operationType) {
        this.name = name;
        this.location = location;
        this.numberOfWorkers = numberOfWorkers;
        this.numberOfMachines = numberOfMachines;
        this.productType = productType;
        this.operationType = operationType;
        System.out.println("Constructor 6: All variables initialized");
    }

    void display() {
        System.out.println("Factory Name: " + name + ", Location: " + location + ", Number of Workers: " + numberOfWorkers + ", Number of Machines: " + numberOfMachines + ", Product Type: " + productType + ", Operation Type: " + operationType);
    }
}


