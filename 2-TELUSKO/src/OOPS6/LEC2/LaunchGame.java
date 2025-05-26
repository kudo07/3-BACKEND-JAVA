package OOPS6.LEC2;

import java.util.Scanner;

class Guesser{
    int guessNumber;
    int guessingNumer(){
        Scanner scan = new Scanner(System.in);
//        scanner class to read data from console
        System.out.println("Guess! Kindly guess the number");
        guessNumber=scan.nextInt();
        return guessNumber;
    }
}

class Player{
    int guessNumber;
    int guessingNumer(){
        Scanner scan = new Scanner(System.in);
//        scanner class to read data from console
        System.out.println("Player ! Kindly guess the number");
        guessNumber=scan.nextInt();
        return guessNumber;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumberGuesser(){
        Guesser g= new Guesser();
        numFromGuesser=g.guessingNumer();
    }
    void collectNumberPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumer();
        numFromPlayer2=p2.guessingNumer();
        numFromPlayer3=p3.guessingNumer();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            System.out.println("Player 1 win the game");
        }
        else if (numFromGuesser==numFromPlayer2){
            System.out.println("player 2 win the game");
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("player 3 win the game");
        }
        else{
            System.out.println("None won the game , GameLost! Try again");
        }
    }
}
public class LaunchGame {
    public static void main(String[] args) {

    Umpire umpire=new Umpire();
    umpire.collectNumberGuesser();
    umpire.collectNumberPlayer();
    umpire.compare();
    }
}
