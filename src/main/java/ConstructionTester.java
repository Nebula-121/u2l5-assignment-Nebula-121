import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        
        //variables
        int numBoards;
        int numWindows;
        double taxRate;
        double total, grandTotal;
        double lumCost = 8;;
        double winCost = 11;
      

        System.out.print("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        taxRate = in.nextDouble();
        
        System.out.println("How many boards do you need? ");
        numBoards = scanner.nextInt();
        numBoards = in.nextDouble();

        System.out.println("How many windows do you need? ");
        numWindows = scanner.nextInt();


        Construction myConstruction = new Construction (taxRate, lumCost, winCost);

        total = test.lumCost (numBoards) + test.winCost (numWindows);
        System.out.print("The total is: " + total);

        grandTotal = test.grandTotal (total);
        System.out.print("The grand total is: " + grandTotal);
    }//ends main method
}//ends class
