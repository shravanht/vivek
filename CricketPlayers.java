public class CricketPlayers {




         // 1. Legend Players
       static   String legendplayers [] = {
            "Sachin Tendulkar", "Ms Dhoni", "Rohit Sharma", "Virat Kohli", 
            "Ricky Pointing", "Kapil Dev", "Kumar Sangakara", "Kallis", 
            "Brian Lara", "Shane warne"
        };

            // 2. Underatted Players
          static  String underattedplayers[] = {
                "Hashim amla", "Ambatti Raydu", "Dilshan", "Ashwin", 
                "Jadeja", "Karun Nair", "Brendon Muclum", "Martin Guptil", 
                "Suresh Raina", "Rahane"
            };

                // 3. Overatted Players
            static String overattedplayers[] = {
                "Glenn Maxwell", "Josh Buttler", "Shubnam Gill", "Babar Azam", 
                "Ben Stokes", "", "Rizwan", "Ruthuraj Gaikwad", 
                "Moeen Ali", "Hardik Pandya"
            };

            
            // 4. Youngsters
            static   String youngsters[] = {
                "Jaiswal", "Abhishek Sharma", "Tilak Verma", "Harshit Rana", 
                "Ishan Kishan", "Rajat Patidar", "Ayush Badoni", "Rinku Singh", 
                "Rachin Ravindra", "Ravi Biahnoi"
            };

                

    public static void main(String[] args) {

      shoesList();
    
  
    }

    
    public static void shoesList(){
      
        System.out.println("Total number of Legend Players: " + legendplayers.length);
        System.out.println("List of Legend Players given are: ");
        for (String players : legendplayers) {
            System.out.print(players + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Underatted Players: " + underattedplayers.length);
        System.out.println("List of Underatted Players given are: ");
        for (String players : underattedplayers) {
            System.out.print(players + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Overatted Players: " + Overatted Players.length);
        System.out.println("List of Overatted Players given are: ");
        for (String players : overattedplayers) {
            System.out.print(players + ", ");
        }
        System.out.println("\n");

        System.out.println("Total number of Youngsters : "  youngsters.length);
        System.out.println("List of Youngsters given are: ");
        for (String players : youngsters) {
            System.out.print(players + ", ");
        }
        System.out.println("\n");

    
       
    
    }
}