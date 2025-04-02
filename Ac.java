class Ac {
    static boolean isConnected = false;  
    static int currentTemperature ;  
    static int maxTemperature = 5;
    static int minTemperature ;

   
    public static void onOrOff() {
        if (isConnected == false) {
            isConnected = true;  
        } else 
		isConnected = false;  
        }
    }
	 public static void increaseTemperature() {
        if (isConnected == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature += 1;  
                System.out.println("Temperature increased. Current temperature: " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached!");
            
        } else {
            System.out.println("AC is off. not increase temperature.");
        }
    }
	
	 }
	 