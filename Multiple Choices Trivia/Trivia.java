//Author: Santigie Sankoh
//Author: Pacifique Linda IKIREZI

import java.util.Scanner;
//Declaration of a class
public class Trivia {
//Declaration of main method
    public static void main(String[] args) {
        String qn1 = "1. What is the latest iPhone?\n "
                + "a. iPhone 10 \n "
                + "b. iPhone 12 \n "
                + "c. iPhone 15";

        String qn2 = "2. Who is the President of the USA?\n "
                + "a. Joe Biden\n "
                + "b. Barack Obama \n "
                + "c. Donald Trump";

        String qn3 = "3. when did mandela became president? \n "
                + "a. 1998 \n "
                + "b. 1990 \n "
                + "c. 1994";

        String qn4 = "4. Which phone is manufactured in Africa?\n "
                + "a. iPhone \n "
                + "b. Mara Phone \n "
                + "c. Samsung";

        String qn5 = "5. How many countries does Africa has?\n "
                + "a. 54\n "
                + "b. 52 \n "
                + "c. 60";

        String qn6 = "6. Who is the Wealthiest man on earth?\n "
                + "a. Bill Gates \n "
                + "b. JEff Bezos \n "
                + "c. Elon Musk";

        String qn7 = "7. How many islands does africa have?\n "
                + "a. 10 \n "
                + "b. 6 \n "
                + "c. 5";

        String qn8 = "8. what is the biggest country in Africa?\n "
                + "a. DRC\n "
                + "b. South Africa \n "
                + "c. Algeria";

        String qn9 = "9. Where is the headquarter of google? \n "
                + "a. Calfornia \n "
                + "b. China \n "
                + "c. Nigeria";

        String qn10 = "10. Where is the headquarter of apple?\n "
                + "a. Kenya \n "
                + "b. Washington \n "
                + "c. South Africa ";
//Declaration of Question array
        Question [] questions = {
                new Question(qn1, "b"),
                new Question(qn2, "a"),
                new Question(qn3, "c"),
                new Question(qn4, "b"),
                new Question(qn5, "a"),
                new Question(qn6, "b"),
                new Question(qn7, "b"),
                new Question(qn8, "c"),
                new Question(qn9, "a"),
                new Question(qn10, "b")
        };
        PlayGame(questions);
    }
//Declaration of PlayGame method
    public static void PlayGame(Question [] questions) {
        Scanner userInput = new Scanner(System.in);
        String playAgain;
//This do while loop is for allowing the user to play again
		do {
        int score = 0;
        for (int a = 0; a < questions.length; a++) {
            System.out.println(questions[a].theQn);
            String answer = userInput.nextLine();
            if(answer.equals(questions[a].answer)) {
                score++;
            }
        }
        System.out.println("YOU MADE IT TO THE END!! YOU GOT: " + score + "/" + questions.length);
		System.out.print("\nENTER 'Y' IF YOU WANT TO KEEP PLAYING and 'N' IF YOU WANT TO STOP: ");
		playAgain = userInput.nextLine();
		} while(playAgain.equalsIgnoreCase("Y"));
    }
}
