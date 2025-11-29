import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\"1\" : for Stone \"2\" : for Paper \"3\" : for Scissor");

        // for user input

        int a = sc.nextInt();
        if (a == 1){
             System.out.println("You have picked stone");
        } else if (a == 2){
            System.out.println("You have picked Paper");
        } else if (a == 3)   {
            System.out.println("You have picked scissor");
        }  else {
             System.out.println("Invalid input!!!! please choose 1, 2, or 3.");
            return;
        }

        // Computer is giving random input

        Random ran = new Random();
        int b = ran.nextInt(3) + 1; // it is generating s a random number from 1 to 3
        if (b == 1) {
            System.out.println("Computer has picked Stone");
         } else if (b == 2){
             System.out.println("Computer has picked paper");
        }else if (b == 3) {
             System.out.println("Computer has picked Scissor") ;
        }

        // result logic

         if (a == b) {
            System.out.println("Match has been drawn");
        } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            System.out.println("You win the match!");
        } else {
             System.out.println("Computer won the match!");
        }
    }
}
