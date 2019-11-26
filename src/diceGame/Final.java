package diceGame;

public class Final {
    // simulating a dice roll fo real
    public static int rollDice(){
        return (int)(Math.random()*6) + 1;
        // Math.random returns a double number >=0.0 and <1.0
    }

    // considering draw
    public static boolean isDraw(int player1Dice, int player2Dice) {
        if(player1Dice == player2Dice) {
            System.out.println("It's a draw");
            return true;
        }
        return false;
    }

    // simulating gameplay, with player1 & player2 as parameters in playGame method
    public static void playGame(String player1, String player2 ) {
        // no need for an iterator, as with random rollDice we never run out of values
        int player1Dice;
        int player2Dice;

        do {
            // no need for the other player.dice != 0 condition because of the correct dice roll simulation that never returns 0
            // player 1 roll
            player1Dice = rollDice();
            System.out.print(player1 + " rolled " + player1Dice + ", ");
            // player 2 roll
            player2Dice = rollDice();
            System.out.println(player2 + " rolled " + player2Dice);
        } while(isDraw(player1Dice, player2Dice));

        // announcing a winner (no draw here, because we never get out of dice rolls)
        if(player1Dice > player2Dice) {
            System.out.println("Round over. " + player1 + " is the winner");
        } else if(player2Dice > player1Dice){
            System.out.println("Round over. " + player2 + " is the winner");
        }
    }

    public static void main(String[] args) {
        // no need to input array of dicerolls, Math.random solves it :)
        // defining a number of rounds
        int rounds = 7;

        // playing game
        for(int round = 0; round < rounds; round++) {
            System.out.println("Round " + (round +1));
            playGame("John", "Steve");
            System.out.println(" ");
        }
    }
}
