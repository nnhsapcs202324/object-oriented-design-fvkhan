import java.util.ArrayList;
import java.util.Scanner;
/**
 * the exam 'has a' list of questions
 *
 * @fvkhan
 * @9feb2024
 */
public class Exam
{
    /*
     * an exam object 'has a' list of questions; an exam 'is not a' question.
     */
    
    private ArrayList<Question> questions;
    
    public Exam()
    {
        this.questions = new ArrayList<Question>();                                                                                                                
    }
    
    public void addQuestion(Question q)
    {
        this.questions.add(q);
    }
    
    public void askQuestions()
    {
        Scanner in = new Scanner(System.in);
        for (Question q : this.questions)
        {
            System.out.println(q.toString());
            System.out.print("Your answer: ");
            String response = in.nextLine();
            
            System.out.println(q.checkAnswer(response));
        }
    }
}
