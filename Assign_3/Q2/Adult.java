// Author: Kavan Chandra
//#: 100693831

// superclass Adult passes methods to child classes
public class Adult
{
private String name;
public int year;

    public Adult( String n, int y)
    {
    name = n;
    year = y;
    }
    // returns year
    public int year()
    {
        return year;
    }
    //returns name
    public String name()
    {
    return name;
    }
}
//Worker child class inherits from Adult and implements Comparable
 class Worker extends Adult implements Comparable<Worker>
 {
     //n represents name and y represents year
     String n;
     int y;

    final String job = "Engineer";
     public Worker(String n, int y)
     {
         super(n, y);
         this.n = n;
         this.y = y;
     }

     // returns the job, name and birth year to a string
     public String toString()
     {
         return job + ", " + n + ", " + y;
     }
     // compareTo method compares the years and puts the smaller year first
     @Override
     public int compareTo(Worker worker) {
         int r;
         int y = worker.year();
         r = Integer.compare(year, y );
         return r;
     }
 }
//Manager child class inherits from Adult and implements Comparable
class Manager extends Adult implements Comparable<Manager>
{
int y;
String n;
    final String job = "Supervisor";
    public Manager(String n, int y)
    {
        super(n, y);
        this.n = n;
        this.y = y;
    }

    public String toString()
    {
        return job + ", " + n +", " + y;
    }
    // compareTo method compares the names and puts the names in A-Z order
    @Override
    public int compareTo(Manager manager) {
        int r;
        String n = manager.name();
        r = name().compareTo(n);
        return r;
    }
}
