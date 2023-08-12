import java.util.Random;
import java.util.Scanner;

class Account {
        int accNum;
        String userName;
        long phoneNum;
        String city;
        long aadharNum;
        String panNum;
        double balance;

        void logIn(int loginAccNum, String loginName) { 
            if (accNum == loginAccNum && userName.equals(loginName)) {
                System.out.println("\nLogin Successful!!\n");
                accountInfo();
                performBankingOperations();
            } else {
                System.out.println("This account doesn't exist. Please enter the account number and user name correctly or create a new account.\n");
            }
        }

        void createNewAccount(String newName, long newPhoneNum, String newCity, long newAadharNum, String newPanNum, double initialDeposit) {
            Random random = new Random();
            accNum = 1000 + random.nextInt(9000); 
            userName = newName;
            phoneNum = newPhoneNum;
            city = newCity;
            aadharNum = newAadharNum;
            panNum = newPanNum;
            balance = initialDeposit;
            System.out.println("New Account Created with Account Number: " + accNum);
            System.out.println("User: " + userName);
            System.out.println("Phone Number: " + phoneNum);
            System.out.println("City: " + city);
            System.out.println("Aadhar Number: " + aadharNum);
            System.out.println("PAN Number: " + panNum);
            System.out.println("Initial Deposit: " + initialDeposit);
        }

        void accountInfo() {
            System.out.println("Account Number: " + accNum);
            System.out.println("User Name: " + userName);
            System.out.println("Phone Number: " + phoneNum);
            System.out.println("City: " + city);
            System.out.println("Aadhar Number: " + aadharNum);
            System.out.println("PAN Number: " + panNum);
            System.out.println("Balance: " + balance+ "\n");
        }

        void performBankingOperations() {
            Scanner scan = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: "+ "\n");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scan.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scan.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("You are successfully logged out. Thank you!\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.\n");
                }
            } while (choice != 4);
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance+ "\n");
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("New Balance: " + balance+ "\n");
            } else {
                System.out.println("Insufficient balance for withdrawal.\n");
            }
        }

        void checkBalance() {
            System.out.println("Current Balance: " + balance +"\n");
        }
    }