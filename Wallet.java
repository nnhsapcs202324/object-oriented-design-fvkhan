
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    // instance variables - replace the example below with your own
    private Card card1;
    private Card card2;
    
    public Wallet()
    {
        
    }

    public void addCard(Card card)
    {
        if (this.card1 == null)
        {
            this.card1 = card;
        }
        
        else if (this.card2 == null)
        {
            this.card2 = card;
        }
    }
    
    public String toString()
    {
        if (this.card1 != null || this.card2 != null)
        {
            String cardInfo = "[" + card1.toString() + "|" + card2.toString() + "]";
            return cardInfo;
        }
        else
        {
            System.out.println("No cards");
            return "No cards";
        }
    }
}
