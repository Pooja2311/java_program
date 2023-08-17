package AbstractFactoryPattern;

public class LoanAccountFactory{
    public static BankAccount createAccount(){
        return new LoanAccount(9);
    }
}
