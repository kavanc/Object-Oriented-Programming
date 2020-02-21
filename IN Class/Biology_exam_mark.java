import java.util.Scanner;

public class Biology_exam_mark {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter your Biology mark out of 63:");
       int mark = input.nextInt();
       System.out.println("This is your mark: "+ mark);
       float percent = (mark/63f)*100;
       System.out.println("Your percentage is: " + percent);







   }

}
