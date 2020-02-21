import java.util.Scanner;
import java.io.File;


public class Birthday {
    public enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);

        //this works
        System.out.print("What\'s your birthday day in the month?");
        int day = userIn.nextInt();
        userIn.nextLine();

        //this works
        System.out.print("What\'s your birth month?");
        int month = userIn.nextInt();
        userIn.nextLine();

        //???
        month=Integer.toString((Month.valueOf(month)).ordinal()+1);
        System.out.print("What\'s your birth year?");
        String year = (userIn.nextLine()).substring(2);







    }





}
