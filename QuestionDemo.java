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
      
      System.out.println( q );
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

