//import java.util.List;
//import java.util.Scanner;
//
//public class MultipleChoice extends Question{
//   private List<String> options;
//   private int correctOption;
//    public MultipleChoice(String question, List<String> options, int correctOption){
//        super(question);
//        this.options = options;
//        this.correctOption = correctOption;
//    }
//
//    public MultipleChoice(String question, String b) {
//        super(question);
//    }
//
//    @Override
//    public void displayQuestion() {
//        System.out.println(getQuestion());
//        for (int i = 0; i < options.size(); i++) {
//            System.out.println((i + 1) + ". " + options.get(i));
//        }
//    }
//
//    @Override
//    public boolean isAnswerRight() {
//        return correctOption == getSelectedOption();
//    }
//
//    @Override
//    public boolean isRightAnswer() {
//        return false;
//    }
//
//    private int getSelectedOption() {
//        Scanner input = new Scanner(System.in);
//        return input.nextInt();
//    }
//}




public class MultipleChoice extends Question {
    private String[] choices;
    private int correctChoiceIndex;

    public MultipleChoice(String text, String[] choices, int correctChoiceIndex) {
        super(text);
        this.choices = choices;
        this.correctChoiceIndex = correctChoiceIndex;
    }

    @Override
    public boolean isCorrect(String answer) {
        int selectedChoice = Integer.parseInt(answer);
        return selectedChoice == correctChoiceIndex;
    }

    @Override
    public void display() {
        System.out.println(getText());
        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + ") " + choices[i]);
        }
    }
}