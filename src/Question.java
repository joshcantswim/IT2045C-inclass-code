public class Question {



    private String text;
    private String answer;

    public Question() {

        this.text = "";
        this.answer = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response){
        return this.answer.equals(response);
    }

    public void display(){
        System.out.println(this.getText());
    }
}
