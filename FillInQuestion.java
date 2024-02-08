import java.util.Scanner;
/**
 * a FillInQuestion is constructed with a string that contains the answer to the question, surrounded by '_'. For example, 'The inventor of Java was _James Gosling_.' 
 * the question should be displayed as 'the inventor of java was --------'
 *
 * @fvkhan
 * @7feb2024
 */

/*
 * the FillInQuestion class extends (i.e, is a subclass of, is derived from) the Question class
 */
public class FillInQuestion extends Question
{
    //do not include instance variables for the text qand answer. The text and the answer instance variables are inherited from the Question class.
    /*
     * this method overrides the setText method in the Question class.
     * sets the question text AND answer.
     * @param questionText the text of the question, including the answer.
     */
    
    /**
     * constructs a FillInQuestion object with the specified text that contains the answer.
     * 
     * @param question the specified question text with the embedded answer.
     */
    public FillInQuestion(String question)
    {
        /*
         * explicitly call the Question class's constructor that takes in a single parameter.
         * calling a superclass's constructor *must* be the first line of code in a subclass constructor.
         * if we don't explicitly call a superclass's constructor, Java will automatically call the superclass's default (i.e., no parameters) constructor
         * if it can
         */
        super(question);
    }
    
    /*
     * use the @override annotation when overriding a method to signal to the compiler to verify that you are in fact overriding and not overloading the
     * method.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();              //the inventor of Java is
        String answer = parser.next();                //James Gosling
        question += "_____________" + parser.next();  //_______________
        /*
         * the code below doesn't work; the inherited instance variables are private; they cannot be accessed directly. we must use the mutator and 
         * accessor methods.
         */
        
        //this.text = question;
        //this.answer = answer;
        
        /*
         * use the 'super' reserved word to call the setText method as defined in the superclass (e.g., Question)
         */
        
        super.setText(question);
        /*
         * we should use the 'this' reserved word to call the setAnswer method. if the subclass doesn't override the setAnswer method, the superclass's
         * method will be called.
         * 
         * we don't want to use the 'super' reserved word in this case, because if we later override the setAnswer method, the overriden method wouldn't
         * be called.
         */
        this.setAnswer(answer);
        
    }
}
