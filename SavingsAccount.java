package AbstractFactoryPattern;
public class SavingsAccount implements BankAccount{
    double intrestRate;

    public SavingsAccount(double ir)
    {
        this.intrestRate = ir;
        registerAccount();
    }

    public void registerAccount(){
        System.out.println("Creating a Savings Account");
    }

    public void getIntrestRate(){
        System.out.println("Intrest Rate for Savings Account is " + this.intrestRate + "% only." );
    }
}