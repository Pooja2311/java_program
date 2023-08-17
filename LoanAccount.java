package AbstractFactoryPattern;

public class LoanAccount implements BankAccount{
    double intrestRate;

    public LoanAccount(double ir)
    {
        this.intrestRate = ir;
        registerAccount();
    }

    public void registerAccount(){
        System.out.println("Creating a Loan Account");
    }

    public void getIntrestRate(){
        System.out.println("Intrest Rate for Loan Account is " + this.intrestRate + "% only." );
    }
}