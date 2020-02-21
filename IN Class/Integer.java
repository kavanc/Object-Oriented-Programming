import java.util.Scanner;
public class Integer {

    public static void main(String[] args)
    {
    int first_num,second_num;
        Scanner scan=new Scanner(System.in);

       System.out.println("Find Out if two integers are multiples.");

       System.out.print("Enter the first integer:");
       first_num= scan.nextInt();

        System.out.print("Enter the second integer:");
       second_num=scan.nextInt();

       if (first_num %second_num==0)
           System.out.println("The numbers are multiples.");
       else
           System.out.println("The numbers are not multiples.");


    }



}