import java.util.Scanner;

public class atmApp {
    public static void main(String[] args) {
        //declare variables
        int balance = 10000;
        int withdraw;
        int deposit;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            //Menu options for user
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println(" Main Menu ");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter an option: ");

            //Get option from user
            int option = scanner.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Enter an amount to withdraw: ");

                    //get withdraw amount from user
                    withdraw = scanner.nextInt();

                    //check balance to see if the withdrawal amount is less or greater than acct balance
                    if (balance >= withdraw){
                        //removes the withdrawn amount from total balance
                        balance = balance - withdraw;
                        System.out.println("====================================");
                        System.out.println("Please collect your money");
                        System.out.println("====================================");
                    }
                    else {
                        //error message
                        System.out.println("====================================");
                        System.out.println("Insufficient Funds");
                        System.out.println("====================================");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter an amount to deposit: ");
                    deposit = scanner.nextInt();

                    //adds deposit to total balance
                    balance = balance + deposit;
                    System.out.println("====================================");
                    System.out.println("Deposit Successful");
                    System.out.println("====================================");
                    System.out.println();
                    break;

                case 3:
                    //display total balance
                    System.out.println("====================================");
                    System.out.println("Balance: $" + balance);
                    System.out.println("====================================");
                    System.out.println();
                    break;

                case 4:
                    //exit from menu
                    System.out.println("====================================");
                    System.out.println("Thank you for banking with us!");
                    System.out.println("====================================");
                    System.exit(0);
            }
        }
    }
}
