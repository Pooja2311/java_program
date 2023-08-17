package AbstractFactoryPattern;

public class CurrentAccount implements BankAccount{
    double intrestRate;

    public CurrentAccount(double ir)
    {
        this.intrestRate = ir;
        registerAccount();
    }

    public void registerAccount(){
        System.out.println("Creating a Current Account");
    }

    public void getIntrestRate(){
        System.out.println("Intrest Rate for Current Account is " + this.intrestRate + "% only." );
    }
}
