import java.util.Random;
import java.util.Stack;
import java.util.Arrays;

public class DiceSimulation
{
   public static void main(String[] args)
   {
       final int NUMBER = 10000;
       Random generator = new Random();

       int die1Value;
       int die2Value;
       int count = 0;
       int snakeEyes = 0;
       int twos = 0;
       int threes = 0;
       int fours = 0;
       int fives = 0;
       int sixes = 0;

       // Stack to store results
       Stack<String> resultsStack = new Stack<>();

       while (count < NUMBER)
       {
           die1Value = generator.nextInt(6) + 1;
           die2Value = generator.nextInt(6) + 1;

           if (die1Value == die2Value)
           {
               switch (die1Value)
               {
                   case 1:
                       snakeEyes++;
                       break;
                   case 2:
                       twos++;
                       break;
                   case 3:
                       threes++;
                       break;
                   case 4:
                       fours++;
                       break;
                   case 5:
                       fives++;
                       break;
                   case 6:
                       sixes++;
                       break;
               }
           }

           count++;
       }

       // Storing results in stack
       resultsStack.push("Snake Eyes: " + snakeEyes + " out of " + count + " rolls.");
       resultsStack.push("Double Twos: " + twos + " out of " + count + " rolls.");
       resultsStack.push("Double Threes: " + threes + " out of " + count + " rolls.");
       resultsStack.push("Double Fours: " + fours + " out of " + count + " rolls.");
       resultsStack.push("Double Fives: " + fives + " out of " + count + " rolls.");
       resultsStack.push("Double Sixes: " + sixes + " out of " + count + " rolls.");

       // Convert stack to array for sorting :))
       String[] resultsArray = resultsStack.toArray(new String[0]);
       Arrays.sort(resultsArray);

       // Display sorted results
       for (String result : resultsArray) {
           System.out.println(result);
       }
   }
}
