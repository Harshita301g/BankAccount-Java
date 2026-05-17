import java.util.Scanner;

public class BankAccount {
    
    // Account details
    static String accountHolder = "Your Name";
    static String accountNumber = "ACC123456";
    static double balance = 5000.00;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("=============================");
        System.out.println("   WELCOME TO MY BANK APP   ");
        System.out.println("=============================");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        
        do {
            // Menu
            System.out.println("\n----- MAIN MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.println("\n✔ Your Current Balance: ₹" + balance);
                    break;
                    
                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("✔ ₹" + depositAmount + " deposited successfully!");
                        System.out.println("✔ New Balance: ₹" + balance);
                    } else {
                        System.out.println("❌ Invalid amount!");
                    }
                    break;
                    
                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("✔ ₹" + withdrawAmount + " withdrawn successfully!");
                        System.out.println("✔ Remaining Balance: ₹" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("❌ Insufficient Balance!");
                    } else {
                        System.out.println("❌ Invalid amount!");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n✔ Thank you for using My Bank App. Goodbye!");
                    break;
                    
                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
            
        } while (choice != 4);
        
        scanner.close();
    }
}
