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
    }
}
}

    
        