
/**
 * Write a description of class StudentIDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentIDCard extends Card
{
    private String idNumber;
    public StudentIDCard(String n, String id)
    {
        super(n);
        this.idNumber = id;
    }
    
    @Override
    public String toString()
    {
        super.toString();
        return "ID Number: " + this.idNumber;
    }
}
