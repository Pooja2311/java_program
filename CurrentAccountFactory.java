package AbstractFactoryPattern;

public class CurrentAccountFactory{
    public static BankAccount createAccount(){
        return new CurrentAccount(6.5);
    }
}
