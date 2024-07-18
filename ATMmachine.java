import java.util.Scanner;

class ATM  {
    float Balance;
    int PIN=3456;

    public void checkpin()
    {
        System.out.println("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu()
    {
       System.out.println("Enter Your Choice:");
       System.out.println("1. Check A/C Balance");
       System.out.println("2. Withdraw Money");
       System.out.println("3. Deposite Money");
       System.out.println("4. EXIT"); 

       Scanner sc = new Scanner(System.in);
       int opt = sc.nextInt();

       if(opt == 1)
       {
        checkBalance();
       }
       else if(opt == 2)
       {
        WithdrawMoney();
       }
       else if(opt == 3)
       {
        DepositMoney();
       }
       else if(opt == 4)
       {
        return;
       }
       else
       {
        System.out.println("Enter a Valid Choice");
       }
    }
    
    public void  checkBalance()
    {
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void WithdrawMoney()
    {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat(); 
        if(amount>Balance)
        {
            System.out.println("Insuffient Balance");
        } 
        else
        {
            Balance = Balance - amount;
            System.out.println("Money Withdeawl Successful");
        }
        menu();  
    }
    public void DepositMoney()
    {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

    
}
public class ATMmachine
{
    public static void main(String[] args)
    {
        ATM obj=new ATM();
        obj.checkpin();
    }
}

