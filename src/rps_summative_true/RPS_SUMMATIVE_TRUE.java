/*
 * Erin McBrien
 * 19/11/2019
 * Rock Paper Scissors Game Summative
 */

package rps_summative_true;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ERMcB6406
 */
public class RPS_SUMMATIVE_TRUE {
    public static Scanner sc = new Scanner(System.in);
    public static int score = 0;
    public static int rock = 0;
    public static int paper = 0;
    public static int scissors = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        play();
        while (playAgain()) {
            play();
        }
    }
    
    public static void play() {
        String computer = computerChoice();
        String user = userChoice();
        determineWinner(user,computer);
    }
    
    public static String computerChoice() {
        Random random = new Random();
        int computerInt = random.nextInt(3)+1;
        String computer = "";
        //computer input
        if (computerInt == 1)
            computer = "R";
        else if (computerInt == 2)
            computer = "P";
        else if (computerInt == 3)
            computer = "S";
        
        return computer;
    }
    
    public static boolean playAgain() {
        //play again sequence
        System.out.println("Would you like to play again? (yes/no)");
        String input = sc.nextLine();
         if (input.toLowerCase().equals("yes")){
          return true;
        } 
         else if (input.toLowerCase().equals("no")){
            return false;
        }
         else{
            System.out.println("Invalid Input; Input again.");
            return playAgain();
        }
    }
    
    public static String userChoice(){
        //menu card
        System.out.println("⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆");
        System.out.println("⋆    Rock Paper Scissors    ⋆");
        System.out.println("⋆      User vs Computer     ⋆");
        System.out.println("⋆ R=Rock P=Paper S=Scissors ⋆");
        System.out.println("⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆");
        System.out.println();
        
        String user = "";
        Scanner keyedInput = new Scanner(System.in);
        
        //user input
        System.out.println("Rock, Paper, Scissors...Go!");
        user = sc.nextLine();
        user.toUpperCase();
        return user;
    }
    
    public static void determineWinner(String user, String computer){
        System.out.println("User's Choice: " + user);
        System.out.println("Computer's Choice: " + computer);
        
        //nested if statements
        //calculations to determine winner
            if (user.equals(computer)){
                System.out.println("TIE");
            }
            //user chooses R (Rock)
            else if (user.equals("R")) {
                rock++;
                if (computer.equals("S"))
                    score++;
                    System.out.println("WIN");
            }
                else if(computer.equals("P")){
                    score--;
                    System.out.println("LOSE");
            }
                else if(user.equals(computer)){
                    System.out.println("TIE");
            }
            //user chooses P (Paper)
            else if (user.equals ("P")) {
                paper++;
                if (computer.equals("R"))
                    score++;
                    System.out.println("WIN");
            }
                else if (computer.equals("S")){
                    score--;
                    System.out.println("LOSE");
            }
                else if(user.equals(computer)){
                    System.out.println("TIE");
            }
            // user chooses S (Scissors)
            else if (user.equals("S")) {
                scissors++;
                if (computer.equals("P"))
                    score++;
                    System.out.println("WIN");
            }
                else if (computer.equals("R")){
                    score--;
                    System.out.println("LOSE");
            }
                else if(user.equals(computer)){
                    System.out.println("TIE");
            }
            //output game score and details
            System.out.println("Your score is " + score + "");
            System.out.println("");
            System.out.println("You chose rock " + rock + " times");
            System.out.println("You chose paper " + paper + " times");
            System.out.println("You chose scissors " + scissors + " times");
            
            return;
        }
    
}
