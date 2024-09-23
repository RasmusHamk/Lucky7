import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the money amount you want to play with and press enter. ");
        int money = Integer.parseInt(in.nextLine());
        
        while (money > 0)
        
        {
            System.out.println("You have " + money + " $ ");
            money = money - 1;

        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int num3 = random.nextInt(10) + 1;

       

        System.out.println("Your random numbers are:");
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
        System.out.println("Number3: " + num3);

        if (num1 == 7 && num2 == 7 && num3 == 7)
        {
            money = money+50;
            System.out.println("You won 50 $.");
            System.out.println("You now have " + money + " dollars.");
        }
        else if (num1 == 7 && num2 == 7)
        {
            money = money+5;
            System.out.println("You won 5 $");
            System.out.println("You now have " + money + " dollars.");
        }
        else if (num2 == 7 && num3 == 7)
            {
            money = money+5;
            System.out.println("You won 5 $");
            System.out.println("You now have " + money + " dollars.");
            }
        else if (num1 == 7 && num3 == 7)
            {
            money = money+5;
            System.out.println("You won 5 $");
            System.out.println("You now have " + money + " dollars.");
            }
        else if (num1 == 7 || num2 == 7 || num3 == 7)
            {
            money = money+1;
            System.out.println("You won 1 $");
            System.out.println("You now have " + money + " dollars.");
            }
        {
        
            if (num1 != 7 && num2 != 7 && num3 != 7)
            {
            System.out.println("You lost.");
            System.out.println("You now have " + money + " dollars left");
            }

        
        if (money > 0)
        {
            System.out.println("\nDo you want to play again? " + ("yes / no"));
            String playAgain = in.nextLine();
            
            if (playAgain.equalsIgnoreCase("no"))
            {
                System.out.println("Thank you for playing :)");
                break;
            }
        }


        if (money == 0)
        {
            System.out.println("You are out of money. Game over.");
        }


        }

        
    }
    in.close();
    }
    
}
