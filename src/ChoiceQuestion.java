import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    ArrayList<String> choices;

    public ChoiceQuestion(ArrayList<String> choices) {
        this.choices = choices;
    }

    public ChoiceQuestion() {

    }

    public void addChoice(String choice, boolean isCorrect) {
        choices.add(choice);

        if(isCorrect){
            this.setAnswer(choice);
        }





    }
    @Override

    public void display(){
        //displays question text
        System.out.println(this.getText());
        super.display();
        //displays the choices

        for (int i=0; i< this.choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + this.choices.get(i));
        }


    }

}
