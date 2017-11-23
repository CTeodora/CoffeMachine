import java.util.Scanner;

public class Main {

	public static void main(String[] args)
    {
        try
        {
            CoffeeMachine coffe_machine=new CoffeeMachine();
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            String input;
            input = sc.next();
            while (!input.equals("0"))
            {
                coffe_machine.transition(input);
                input = sc.next();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
