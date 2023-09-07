//
//public abstract class Question {
//    private final String question;
//    private boolean isRight;
//
//    public Question (String question) {
//        this.question = question;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public abstract void displayQuestion();
//    public abstract boolean isAnswerRight();
//    public void setRight (boolean right) {
//        isRight = right;
//    }
//
//    public abstract boolean isRightAnswer();
//
////    public abstract boolean isRightAnswer();
//}



public abstract class Question {
    private String text;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract boolean isCorrect(String answer);

    public abstract void display();

    public String getCorrectAnswer() {
        return null;
    }
}