//import java.util.ArrayList;
//import java.util.List;
//
//public class Quiz {
//    private List<Question> questions= new ArrayList<>();
//    public Quiz() {
//        questions = new ArrayList<>();
//    }
//    public void addQuestion(Question question) {
//        questions.add(question);
//    }
//
//    public void runQuiz() {
//        int score = 0;
//        for (Question question : questions) {
//            question.displayQuestion();
//            boolean isRight = question.isAnswerRight();
//            question.setRight(isRight);
//            if (isRight) {
//                System.out.println("Wow look at that.. YOU'RE RIGHT!\n");
//                score++;
//            } else {
//                System.out.println("That ain't right -_-\n");
//            }
//        }
////        System.out.println("Lets check your score: " + score + "/" + questions.size());
//    }
//
//
//
//
//}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        Object quiz = new Object();
        for (Question question : questions) {
            question.display();
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer(s) is/are: " + question.getCorrectAnswer() + "\n");
            }
        }

        // Close the scanner
        scanner.close();
    }


    public Object getText() {
        return questions;
    }
}