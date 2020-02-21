import java.util.Scanner;
import java.util.Random;

public class Guessing_game {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101);
        int guess;
        boolean correct=false;
        System.out.println("i\'m thinking of a num between o and 100(inclusive).");
        while(!correct){
            System.out.println("What\'s your guess?");
            guess = input.nextInt();
           if(guess==num){
            correct= true;
            System.out.println("Got it");
            }
        }



    }


}









