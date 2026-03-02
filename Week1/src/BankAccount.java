public class BankAccount {
    //Trạng thái
    private String accountNumber;
    private String ownerName;
    private double balance = 0.0;

    //
    public void openAccount(String accNum, String owner) {
        this.accountNumber = accNum;
        this.ownerName = owner;
    }

    // Hành vi nạp tiền
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Hành vi rút tiền (rút được khi tài khoản dư)
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    // Định danh
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.openAccount("101202303", "Nguyen Van A");
        myAccount.deposit(500.0);
        myAccount.withdraw(150.0);
    }
}
