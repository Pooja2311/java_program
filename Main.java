package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {


        SavingsAccount sa = (SavingsAccount) SavingsAccountFactory.createAccount();
        sa.getIntrestRate();

        CurrentAccount ca = (CurrentAccount) CurrentAccountFactory.createAccount();
        ca.getIntrestRate();

        LoanAccount la = (LoanAccount) LoanAccountFactory.createAccount();
        la.getIntrestRate();
    }
}