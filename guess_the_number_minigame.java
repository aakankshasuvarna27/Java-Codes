
/**
 * Created by yaito on 29/10/2017
 */

import java.io.*; 
 
class guessNumber { 
    public static void main (String[]args) throws IOException 
    { 
        engine run = new engine(); 
        run.menu(); 
    } 
} 
 
class engine { 
        String player_name; 
         
    void menu () throws IOException { 
        boolean on = true; 
    
    //Getting player name
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Input your name"); 
        player_name = reader.readLine(); 
    
    //The game begin here
        while (on){ 
            int answer,userAnswer,tries = 0; 
        System.out.println("\t Menu"); 
        System.out.println("Welcome to the guess the number game, "+player_name+", select the an option:"); 
        System.out.println("\t1. Games Instruction"); 
        System.out.println("\t2. Play"); 
        System.out.println("\t3. Close"); 
        int choice = Integer.parseInt(reader.readLine()); 
         
        switch(choice){ 
            case 1 : instruction(); 
                    break; 
            case 2 : answer = (int) (Math.random()*5000+1); //Create an random number from 1 - 5000
                     System.out.println("\nLet the fun begin\nNow guess!\n"); 
                  
                     while (tries<15){ 
                         userAnswer = Integer.parseInt(reader.readLine()); 
                         tries = tries+1; 
                         int end = 15-tries; // tries left to end the game
                          
                            //if the player is lucky enough to guess the number it enter the if sequence
                         if (userAnswer == answer){ 
                             System.out.println("\nCongratulation "+player_name+", you WON!!!"); 
                             System.out.println("You did it on your "+tries+" try\n"); 
                             tries = tries+end; 
                            //if the player successfully guess the number, you just add the your current tries with the tries left to end the while loop inmediatly
                         } 
                            //if the player fail to guess the number after 15 tries
                         else{ 
                            if (tries==15){ 
                                        System.out.println("\nYou have "+end+" tries left\n"); 
                                        System.out.println("The number was: "+answer+"\n"); 
                                        System.out.println("You lose, Try again and better luck next time\n"); 
                             tries = tries+end; 
                             //if the player fail guess the number, you just add the your current tries with the tries left to end the while loop
                                          } 
 
                            //everytime the player guess a number, the game will give a hint, if the number is too low or is too high.
                                        else{ 
                                 if(userAnswer>answer){ 
                                     System.out.println("\nToo high, try with a lower number"); 
                                     System.out.println("You have "+end+" tries left\n"); 
                                     }  
                                        else { 
                                            if (userAnswer<answer){ 
                                                System.out.println("\nToo low, try with a higher number"); 
                                                System.out.println("You have "+end+" tries left\n"); 
                                                } 
                                } 
                         } 
                     } 
                     } 
                    break; 
            case 3 : on = false; 
                    break; 
        default : System.out.println("Invalid Option \nTry again"); 
        } 
         
        } 
    } 
     
    void instruction(){ 
        System.out.println("\nWelcome to the game "+player_name+",\nThese are the rules of the game,\nThe system will choose a random number between 1 to 5000"); 
        System.out.println("You must guess which number it is,\nYou will have 15 tries to guess,"); 
        System.out.println("Each time you guess a number, if it is wrong the system will give you a hint.\nGood Luck!!\n"); 
    } 
} 
