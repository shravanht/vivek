public class CharReferences {
    public static void main(String[] args) {
       
        Character[] chars = new Character[10];

       
        chars[0] = 'A';
        chars[1] = 'B';
        chars[2] = 'C';
        chars[3] = 'D';
        chars[4] = 'E';
        chars[5] = 'F';
        chars[6] = 'G';
        chars[7] = 'H';
        chars[8] = 'I';
        chars[9] = 'J';

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}