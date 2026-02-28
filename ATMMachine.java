import java.util.Scanner;

public class ATMMachine {

    public static void main(String[] args) {
        int balance = 100000000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==========================================================");
            System.out.println("___________|| Welcome to JP-Group of Bank ATM ||__________");
            System.out.println("==========================================================");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("==========================================================");
            System.out.print("Choose the operation you want to perform: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your Money.");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be Deposited: ");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.print("Your Money has been successfully Deposited: ");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("==========================================================");
                    System.out.println("_________||Thank You for useing JP-Group of Bank ATM||____");
                    System.out.println("==========================================================");
                    System.exit(0);
                    break;
            }

        }
    }
}