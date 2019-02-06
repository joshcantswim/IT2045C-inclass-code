import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);


    Question question1 = new Question();
    question1.setText("Who invented Java?");
    question1.setAnswer("James G");

        question1.display();

    String userResponse = in.nextLine();
        System.out.println(question1.checkAnswer(userResponse));


        ChoiceQuestion question2 = new ChoiceQuestion();
        question2.setText("What was the first name for Java?");
        question2.addChoice("Duke", false);
        question2.addChoice("Oak", true);
        question2.addChoice("C#", false);

        question2.display();
        String userResponse2 = in.nextLine();
        System.out.println(question2.checkAnswer(userResponse2));

        









    }
}
