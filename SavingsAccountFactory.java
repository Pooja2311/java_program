package AbstractFactoryPattern;

public class SavingsAccountFactory{
    public static BankAccount createAccount(){
        return new SavingsAccount(5.5);
    }
}