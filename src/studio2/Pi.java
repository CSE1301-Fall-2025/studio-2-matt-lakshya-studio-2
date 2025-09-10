import java.util.Scanner;

public class Pi {
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Starting Money: ");
    int darts_thrown = in.nextInt();

    for (int i = 0; i < darts_thrown; i++)
    {
        double x = Math.random();
        double y = Math.random();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    //NOT FINISHED OUT OF TIME
    

    
}
}
