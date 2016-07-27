public class BankMain {

    public static void main(String[] args) {
        BankAccnt[] accounts = new BankAccnt[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccnt("M" + i, i * 100, i % 2 == 0 ? "Saving" : "Current");
        }

        for (BankAccnt b : accounts) {
            b.display();
            System.out.println("*********************************************************************");
        }
        accounts[0].deposit(400);
        accounts[0].withdraw(100);
    }
}