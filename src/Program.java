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

    }
}
