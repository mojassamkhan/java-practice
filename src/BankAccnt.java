public class BankAccnt {
    static int TotalAccount = 0;

    private String nameofdepositor;
    private long accountNo;
    private String typeOfAcnt;
    private long balance;

    public BankAccnt() {
        this("unknown", 0);
    }

    public BankAccnt(String name, long deposit) {
        this(name, deposit, "Saving");
    }

    public BankAccnt(String name, long deposit, String type) {
        TotalAccount++;
        accountNo = TotalAccount;

        nameofdepositor = name;
        balance = deposit;
        typeOfAcnt = type;
    }

    public void display() {
        String s = "[Account Number: " + accountNo + "]\n[Name: " + nameofdepositor + "]\n[Balance: " + balance + "]\n[Account Type: " + typeOfAcnt + "]";
        System.out.println(s);
    }

    public void deposit(long amount) {
        balance = balance + amount;
        System.out.println("Your balance is: " + balance);
    }

    public void withdraw(long amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Not Enough Balance In your Account");
        }
    }

    @Override
    public String toString() {
        String s = "[Account Number: " + accountNo + "]\n[Name: " + nameofdepositor + "]\n[Balance: " + balance + "]\n[Account Type: " + typeOfAcnt + "]";
        return s;
    }
}

// new BankAccount(); - init account number, balance
// new BankAccount(String name, long deposit); - init account number, balance, name