//public class QuizRunner {
//    public static void main(String[] args) {
//        Quiz newQuiz = new Quiz();
//
////        System.out.println("Time For Sports Trivia!!");
//        newQuiz.addQuestion( new MultipleChoice(("Where did Dwayne Wade go to college?\n a) LSU\n b) Marquette\n c) Duke"), "b"));
//
//        newQuiz.addQuestion(new TrueOrFalse(("Carmelo Anthony has won 2 Olyympic Gold Medals\n(True or False)"), "false"));
//
//        newQuiz.addQuestion(new Checkbox("Choose the teams Lebron James did not play for\n a)Knicks\n b)Heat\n c)Lakers\n d)Warriors", "a d"));
//
//
//        newQuiz.runQuiz();
//
//    }
//}


import java.util.Scanner;


public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion(new MultipleChoice("Where did Dwayne Wade go to college?",
                new String[]{"a) LSU", "b) Marquette", "c) Duke"}, 1));

        quiz.addQuestion(new Checkbox("Choose the teams LeBron James did not play for",
                new String[]{"a) Knicks", "b) Heat", "c) Lakers", "d) Warriors"},
                new boolean[]{true, false, false, true}));

        quiz.addQuestion(new TrueOrFalse("Carmelo Anthony has won 2 Olympic Gold Medals (True or False)", false));

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        Question[] questions = new Question[0];
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

        // Calculate and display the final score
        int totalQuestions = 0;
        try {
            quiz.getText().wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Quiz completed!");
        System.out.println("You got " + score + " out of " + totalQuestions + " questions correct.");
    }
}