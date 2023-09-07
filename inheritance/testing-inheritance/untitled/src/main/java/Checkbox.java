//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Checkbox extends Question {
//    private List<String> options;
//    private List<Integer> correctOption;
//
//    public Checkbox(String question, List<String> options, List<Integer> correctOption) {
//        super(question);
//        this.options = options;
//        this.correctOption = correctOption;
//    }
//
//    public Checkbox(String question, String aD) {
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
//        List<Integer> selectedOptions = getSelectedOptions();
//        return selectedOptions.containsAll(correctOption) && correctOption.containsAll(selectedOptions);
//    }
//
//    @Override
//    public boolean isRightAnswer() {
//        return false;
//    }
//
////    @Override
////    public boolean isRightAnswer() {
////        return false;
////    }
//
//    private List<Integer> getSelectedOptions() {
//        Scanner input = new Scanner(System.in);
//        List<Integer> selectedOptions = new ArrayList<>();
//        System.out.println("Select option (enter 0 to finish):");
//        int option ;
//        while ((option = input.nextInt()) != 0) {
//            selectedOptions.add(option);
//        }
//        return selectedOptions;
//    }
//}



public class Checkbox extends Question {
    private String[] choices;
    private boolean[] correctAnswers;

    public Checkbox(String text, String[] choices, boolean[] correctAnswers) {
        super(text);
        this.choices = choices;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public boolean isCorrect(String answer) {
        String[] selectedAnswers = answer.split(",");
        if (selectedAnswers.length != correctAnswers.length) {
            return false;
        }

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] && !selectedAnswers[i].equals("true") ||
                    !correctAnswers[i] && selectedAnswers[i].equals("true")) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void display() {
        System.out.println(getText());
        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + ") " + choices[i]);
        }
    }
}
