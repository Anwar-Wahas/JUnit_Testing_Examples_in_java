/**
 * Created by Dell on 04/04/2022.
 */
public class Bank {

    public double calculatingInterest(double balance) {

        if (balance < 0)
            throw new IllegalArgumentException("Invalid");

        else if (balance <= 100)
            return (0.03 * balance) + balance;

        else if (balance < 1000)
            return (0.05 * balance) + balance;

        else return (0.07 * balance) + balance;

    }
}
