
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
    private String cardNumber;
    private String pin;

    public ATMCard(String name, String cardNumber, String pin)
    {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    
    @Override
    public String toString()
    {
        super.toString();
        return "Card number: " + this.cardNumber + "\nPin: " + this.pin;
    }
}
