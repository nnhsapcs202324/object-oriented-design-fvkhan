import java.util.GregorianCalendar;
/**
 * Write a description of class DriversLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriversLicense extends Card
{
    // instance variables - replace the example below with your own
    private String expirationDate;

    public DriversLicense(String n, String expirationDate)
    {
       super(n);
       this.expirationDate = expirationDate;
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Expiration date: " + this.expirationDate;
    }
    
    @Override
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        Integer currentYear = calendar.get(calendar.YEAR);
        Integer expYear = Integer.valueOf(this.expirationDate);
        if (expYear>currentYear )
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
