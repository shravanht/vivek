public class PinCodeReferences {
    public static void main(String[] args) {
      
        String[] pinCodes = new String[10];

        pinCodes[0] = "560064"; // Banglore
        pinCodes[1] = "400001"; // Mumbai
        pinCodes[2] = "600001"; // Chennai
        pinCodes[3] = "700001"; // Kolkata
        pinCodes[4] = "500001"; // Hyderabad
        pinCodes[5] = "411001"; // Pune
        pinCodes[6] = "140001"; // Chandigarh
        pinCodes[7] = "122001"; // Gurgaon
        pinCodes[8] = "302001"; // Jaipur
        pinCodes[9] = "201001"; // Noida

        
        System.out.println("List of Area PIN Codes:");
        for (int i = 0; i < pinCodes.length; i++) {
            System.out.println("PIN Code " + (i + 1) + ": " + pinCodes[i]);
        }
    }
}