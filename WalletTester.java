
/**
 * Write a description of class WalletTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletTester
{
    public static void main(String args[])
    {
        ATMCard atm = new ATMCard("fatimah", "123456", "1234");
        DriversLicense license = new DriversLicense("fatimah", "2020");
        Wallet wallet = new Wallet();
        wallet.addCard(atm);
        wallet.addCard(license);
        System.out.println(wallet.getExpiredCardCount());
    }
}
