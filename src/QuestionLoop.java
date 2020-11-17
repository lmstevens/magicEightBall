import java.util.Scanner;
import java.util.ArrayList;

public class QuestionLoop {
    
    public static void main(String[] args) {

        String questionPet = "What is the name of your favorite pet?";
        String questionPetAge = "What is the age of your favorite pet?";
        String questionLuckyNumber = "What is your lucky number?";
        String questionQB = "Do you have a favorite quarterback (yes/no)?";
        String questionQBJersey = "What is their jersey number? (ex: 1; 29)";
        String questionCarDigits = "What is the two-digit model year of your car? (ex: 1999 equals 99; or 2014 equals 14)";
        String questionActor = "What is the first name of your favorite actor or actress? (ex: Lizzo; Neil)";
        String questionRanNum = "Enter a random number between 1 and 50.";

        ArrayList<String> questionList = new ArrayList<>();
        questionList.add(questionPet);
        questionList.add(questionPetAge);
        questionList.add(questionLuckyNumber);
        questionList.add(questionQB);
        questionList.add(questionQBJersey);
        questionList.add(questionCarDigits);
        questionList.add(questionActor);
        questionList.add(questionRanNum);

        ArrayList<String> answerList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i));
            String userAnswer = scanner.nextLine();
                // if(userAnswer == "no"){
                //     int i += 1;
                // }
            answerList.add(userAnswer);    
        }

        System.out.println("Your Answers are: " +answerList);

    }
}
