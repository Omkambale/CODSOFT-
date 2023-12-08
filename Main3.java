import java.util.*;

class Main3 {
    public static void main (String args[]){
        int balance=1000,withdraw,deposit,choice;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Menu:-\n1.withdraw.\n2.deposite.\n3.Check Balance.\n4.Exit.");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("enter the amount to be withdraw: ");
                    withdraw=sc.nextInt();
                    if (balance>=withdraw){
                        balance =balance-withdraw;
                        System.out.println("withdrawal successful..!");
                        System.out.println("Balance after withdrawal is $"+balance);
                    }
                    else{
                        System.out.println("You don't have enough balance..!");
                    }
                break;
                case 2:
                    System.out.println("Enter the amount to be deposite: ");
                    deposit=sc.nextInt();
                    System.out.println("Deposited successfully..!");
                    balance=balance+deposit;
                    System.out.println("balace after depositing is $"+balance);
                break;    
                case 3:
                    System.out.println("Your balance is $"+balance);
                break;
                case 4:
                    System.out.println("Exited successfully..!");
                    System.exit(0);
                break;
                default:
                System.out.println("Please enter valid choice");
            }
            
        }
    }
}