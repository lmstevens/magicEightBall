public class AsciiChars {

    public static void printNumbers() {

        for (int i = 48; i < 58; i++) {
            String myAsciiNumber = Character.toString((char) i);
            System.out.print(myAsciiNumber);
        }
    }
    public static void printLowerCase() {
        
        for (int i = 97; i < 123; i++) {
            String myAsciiLowerCase = Character.toString((char)i);
            System.out.print(myAsciiLowerCase);
        } 
    }
    public static void printUpperCase() {
        for(int i = 65; i < 91; i++) {
            String myAsciiUpperCase = Character.toString((char)i);
            System.out.print(myAsciiUpperCase);
        }
        
    }

    public static void main(String[] args) {
        AsciiChars.printNumbers();

    }

    // public static void printLowerCase() {
    // // TODO: print valid lowercase alphabetic input
    // }

    // public static void printUpperCase() {
    // // TODO: print valid uppercase alphabetic input
    // }
    // public static void main(String[] args) {
    // printNumbers();
    // }

}
