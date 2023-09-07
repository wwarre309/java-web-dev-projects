//import java.util.Scanner;
//
//
//public class TrueOrFalse extends Question {
//    private boolean rightAnswer;
//    public TrueOrFalse(String question, String rightAnswer) {
//        super(question);
//        this.rightAnswer = Boolean.parseBoolean(String.valueOf(rightAnswer));
//    }
//
//    @Override
//    public void displayQuestion() {
//        System.out.println(getQuestion());
//        System.out.println("1: True");
//        System.out.println("2: False");
//    }
//
//    @Override
//    public boolean isAnswerRight() {
//        return false;
//    }
//
//    @Override
//    public boolean isRightAnswer() {
//        return rightAnswer == getSelectedAnswer();
//    }
//
//
//
//    private boolean getSelectedAnswer() {
//        Scanner input = new Scanner(System.in);
//        int option = input.nextInt();
//        return option == 1;
//    }
//}


public class TrueOrFalse extends Question {
    private boolean correctAnswer;

    public TrueOrFalse(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean isCorrect(String answer) {
        boolean selectedAnswer = Boolean.parseBoolean(answer.toLowerCase());
        return selectedAnswer == correctAnswer;
    }

    @Override
    public void display() {
        System.out.println(getText() + " (True/False)");
    }
}