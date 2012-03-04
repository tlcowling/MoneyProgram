import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SavingsAccountTest {

    @org.junit.Test
    public void depositAndWithdrawal() {
        SavingsAccount account = new SavingsAccount();
        account.deposit(100);
        assertThat(account.balance(), equalTo(100));
        account.withdraw(50);
        assertThat(account.balance(), equalTo(50));
    }

    @Test
    public void negativeBalanceWorksJustFine() {
        SavingsAccount account = new SavingsAccount();
        account.withdraw(75);
        assertThat(-75, equalTo(account.balance()));
    }

    @Test
    public void nextYear() {
        SavingsAccount account = new SavingsAccount();
        account.deposit(10000);
        SavingsAccount nextYear = account.nextYear(10);
        assertThat(nextYear.balance(), equalTo(11000));
    }
}
