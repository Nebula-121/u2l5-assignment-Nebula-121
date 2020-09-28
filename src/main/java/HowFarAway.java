import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startingLat, startingLong, endingLat, endLong, distance;

        //the user input and variables 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Put the starting latitude of the location: ")
        startingLat = in.nextDouble();

        System.out.print("Put the starting longitude of the location: ")
        startingLong = in.nextDouble();

        System.out.print("Put the ending latitude of the location: ")
        endingLat = in.nextDouble();

        System.out.print("Put the ending longitude of the location: ")
        endingLong = in.nextDouble();


        //establishes the starting and ending GeoLocation
        GeoLocation startingLoc = new GeoLocation (startingLat, startingLong);

        GeoLocation endingLoc = new GeoLocation (endingLat, endingLong);


        //establishes the distance
        distance = startingLoc.distanceFrom (endingLoc);
         System.out.print("The distance is " + distance + " miles.");
    }//ends main method
}//ends class