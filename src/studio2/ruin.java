import java.util.Scanner;

public class ruin {
public static void main(String[] args)
{
    //Get Inputs
    Scanner in = new Scanner(System.in);
    System.out.println("Starting Money: ");
    double startAmount = in.nextDouble();
    System.out.println("Win Chance (0-1): ");
    double winChance = in.nextDouble();
    System.out.println("Win Limit: ");
    double winLimit = in.nextDouble();
    System.out.println("Simulations: ");
    int totalSimulations = in.nextInt();

int daysWon = 0;
double currentAmount;
for(int i = 0; i < totalSimulations; i++)
{
    currentAmount = startAmount;
    while(!((currentAmount <= 0) || (currentAmount >= winLimit)))
    {   
        if (Math.random() <= winChance)
        {
            currentAmount++;
            // System.out.println("Won! Current Balance: " + currentAmount);
        }
        else
        {
            currentAmount--;
            // System.out.println("Lost... Current Balance: " + currentAmount);
        }

    }
    if (currentAmount >= winLimit)
        {
            // System.out.println("Reached Win Limit");
            daysWon++;
            
        }
    else
        {
            // System.out.println("You lost all your money");
        }

}

System.out.println("Days Won: "+ daysWon);
System.out.println("Ruin Rate: " + (((double)(totalSimulations - daysWon)/ totalSimulations) * 100) + "%");
double expectedRuin;

if (winChance == 0.5)
{
    expectedRuin = 1 - (startAmount/winLimit);
}
else
{
    double alpha = (1 - winChance)/winChance;
    expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit)) / (1 - Math.pow(alpha, winLimit));
}
System.out.println("Expected Ruin: " + expectedRuin);
}
}
