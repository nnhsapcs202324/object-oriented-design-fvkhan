import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);
      
    String text = "The inventor of Java is _James Gosling_.";
    Question q = new FillInQuestion(text);
    //q.setText(text);
      
    // System.out.println( q );
    // System.out.print("Your answer: ");
    // String response = in.nextLine();
    // System.out.println(q.checkAnswer(response));
    
    /*
     * we cannot call a choiceQuestion method if the reference variable is of type Question
     */
      
    // ChoiceQuestion q2 = new ChoiceQuestion("Who founded Apple?");
    q2.addChoice("Bill Gates", false);
    q2.addChoice("Steve Jobs", true);
      
    Exam exam = new Exam();
    exam.addQuestion(q);
    exam.addQuestion(q2);
    exam.askQuestions();
   }
}

