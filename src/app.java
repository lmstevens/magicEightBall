import java.util.Scanner;

class App {

    public static void userContinue() {
        Scanner scanner2 = new Scanner(System.in);

        String Str1 = new String("yes");
        String Str2 = new String("y");
        String Str3 = new String("no");
        String Str4 = new String("n");

        while(true){
            System.out.println("Do you wish to continue to the interactive portion? (yes/no)?");
            String userResponse = scanner2.nextLine();
            
            if ((userResponse.equalsIgnoreCase(Str1)) || (userResponse.equalsIgnoreCase(Str2))) {
                System.out.println("On we go!");
                break;
            } 
            if ((userResponse.equalsIgnoreCase(Str3)) || (userResponse.equalsIgnoreCase(Str4))) {
                System.out.println("Sorry to see you go. Please return later to complete the survey!");
                // maybe (if time) create a function that can be called that ends the program completely.
                break;
            }
            if(!userResponse.equalsIgnoreCase("null")){
                System.out.print("Invalid Anser. ");
                continue;

            }
            scanner2.close();
            break;

        }
    }

    // public static void checkResponse(String userResponse) {
    //     // String Str1 = new String("yes");
    //     // String Str2 = new String("y");
    //     // String Str3 = new String("no");
    //     // String Str4 = new String("n");

    //     // if ((userResponse.equalsIgnoreCase(Str1)) || (userResponse.equalsIgnoreCase(Str2))) {
    //     //     System.out.println("On we go!");
    //     // // } else if ((userResponse.equalsIgnoreCase(Str3)) || (userResponse.equalsIgnoreCase(Str4))) {
    //     //     System.out.println("Sorry to see you go. Please return later to complete the survey!");
    //     // } else {
    //         System.out.println("Invalid Anser.");
    //         // Scanner scanner2 = new Scanner(System.in);

    //         // do {
    //         //     System.out.println("Do you wish to continue to the interactive portion? (yes/no)?");
    //         //     String userResponse2 = scanner2.nextLine();
    //         //     App.checkResponse(String userResponse2);

    //         //     // String userResponse2 = scanner2.nextLine();
                

    //         // } 
    //         // while (!scanner2.hasNext(((Str1) || (Str2) || (Str3) || (Str4))));
    //         // System.out.println("Sorry to see you go. Please return later to complete the survey!");
    //     // }
    // }

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        System.out.println();
        AsciiChars.printLowerCase();
        System.out.println();
        AsciiChars.printUpperCase();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String userName = scanner.nextLine();
        System.out.println("Your name is: " + userName);

        userContinue();
        // System.out.println("Do you wish to continue to the interactive portion? (yes/no)?");
        // String userResponse = scanner.nextLine();
        // checkResponse(userResponse);

        QuestionLoop.main(args);


    }
}
