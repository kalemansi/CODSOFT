import java.util.Scanner;


public class NumberGame{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Attempts=7;
        int finals=0;
        boolean playAgain=true;
        System.out.println("       WELCOME...!!   ");
        System.out.println("...NUMBER GUESSING GAME...");
        System.out.println("You have about "  +Attempts+  " Attempts to win game !!");
        while(playAgain)
        {
            int mynumber = (int)(Math.random()*100);
            boolean guess=false;
            for(int i=0;i<Attempts;i++)
            {
                System.out.println("Attempt "  +(i+1)+  " Enter your guess:");
                int user=sc.nextInt();
                if(user==mynumber){
                guess=true;
                finals+=1;
                System.out.println("  YOU WON IT  ");
                break;
            }
            else if(user>mynumber)
            {
                System.out.println("number is too large");
            }
            else
            {
                System.out.println("number is too small");
            }

            }
            System.out.println("Do you want to play again(y/n)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y");

            

        }
        System.out.println("Your Score is"+finals);
    }
    
        

        
    
}

    
    
    
