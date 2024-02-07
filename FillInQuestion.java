
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
    /*
     * use the @override annotation when overriding a method to signal to the compiler to verify that you are in fact overriding and not overloading the method.
     */
    
    @Override
    public void setText(String questionText)
    {
        
    }
}
