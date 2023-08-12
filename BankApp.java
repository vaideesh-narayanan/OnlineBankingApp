import java.util.Scanner;

public class BankApp {
        public static void main(String arg[]) {
            Scanner scan = new Scanner(System.in);
            Account account = new Account(); // Create an instance of Account

            int choice;

            do {
                System.out.println("Welcome to the online Banking Application");
                System.out.println("Choose the options from below");
                System.out.println("Enter 1 to Create a New Account");
                System.out.println("Enter 2 to Log In");
                System.out.println("Enter 3 to Exit");
                System.out.print("Enter your choice: \n");
                choice = scan.nextInt();
                scan.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter User Name: ");
                        String newName = scan.nextLine();
                        System.out.print("Enter Phone Number: ");
                        long newPhoneNum = scan.nextLong();
                        scan.nextLine(); // Consume newline
                        System.out.print("Enter City: ");
                        String newCity = scan.nextLine();
                        System.out.print("Enter Aadhar Number: ");
                        long newAadharNum = scan.nextLong();
                        scan.nextLine(); // Consume newline
                        System.out.print("Enter PAN Number: ");
                        String newPanNum = scan.nextLine();
                        System.out.print("Enter Initial Deposit: ");
                        double initialDeposit = scan.nextDouble();
                        scan.nextLine();
                        account.createNewAccount(newName, newPhoneNum, newCity, newAadharNum, newPanNum, initialDeposit);
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int loginAccNo = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        System.out.print("Enter User Name: ");
                        String loginName = scan.nextLine();
                        account.logIn(loginAccNo, loginName);
                        break;
                    case 3:
                        System.out.println("Thank you for using the banking app. Goodbye!\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.\n");
                }
            } while (choice != 3);
        }
    }
