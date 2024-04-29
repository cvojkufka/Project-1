import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int rounds = 0;
        boolean keepGoing = true;

        int player1Wins = 0;
        int player2Wins = 0;
        int chance = 0;

        while (keepGoing) {
            System.out.println("Please enter odd amount of rounds: ");
            rounds = scnr.nextInt();

            if (rounds % 2 != 1) {
                System.out.println("Please try again.");
            } else {
                keepGoing = false;
            }
        }

        for (int i = 1; i <= rounds; i++) {
            chance = rand.nextInt(2);
            keepGoing = true;

            System.out.println("Round " + i + ":" + "\n----------------");

            System.out.println("Player 1: Please select a character and enter its stats");

            System.out.println("Enter name: ");
            String player1Name = scnr.next();

            System.out.println("Enter HP: ");
            int player1HP = scnr.nextInt();

            System.out.println("Enter move name: ");
            String player1Move = scnr.next();

            System.out.println("Enter move's power: ");
            int player1Power = scnr.nextInt();

            System.out.println("Enter attack speed: ");
            int player1Speed = scnr.nextInt();

            System.out.println("\nPlayer 2: Please select a character and enter its stats");

            System.out.println("Enter name: ");
            String player2Name = scnr.next();

            System.out.println("Enter HP: ");
            int player2HP = scnr.nextInt();

            System.out.println("Enter move name: ");
            String player2Move = scnr.next();

            System.out.println("Enter move's power: ");
            int player2Power = scnr.nextInt();

            System.out.println("Enter attack speed: ");
            int player2Speed = scnr.nextInt();

            while ((player1HP > 0) && (player2HP > 0)) {
                if (player1Speed > player2Speed) {

                    player2HP -= player1Power;

                    if (player2HP <= 0) {
                        System.out.println("Player 1 is the winner.\n");
                        player1Wins++;
                        keepGoing = false;

                    } else {

                        player1HP -= player2Power;

                        if (player1HP <= 0) {
                            System.out.println("Player 2 is the winner.\n");
                            player2Wins++;
                            keepGoing = false;

                        }
                    }
                } else if (player1Speed < player2Speed) {

                    player1HP -= player2Power;

                    if (player1HP <= 0) {
                        System.out.println("Player 2 is the winner.\n");
                        player2Wins++;
                        keepGoing = false;

                    } else {

                        player2HP -= player1Power;

                        if (player2HP <= 0) {
                            System.out.println("Player 1 is the winner.\n");
                            player1Wins++;
                            keepGoing = false;

                        }
                    }
                } else {
                    if (chance == 0) {

                        player2HP -= player1Power;

                        if (player2HP <= 0) {
                            System.out.println("Player 1 is the winner.\n");
                            player1Wins++;
                            keepGoing = false;

                        } else {

                            player1HP -= player2Power;

                            if (player1HP <= 0) {
                                System.out.println("Player 2 is the winner.\n");
                                player2Wins++;
                                keepGoing = false;

                            }
                        }
                    } else {

                        player1HP -= player2Power;

                        if (player1HP <= 0) {
                            System.out.println("Player 2 is the winner.\n");
                            player2Wins++;
                            keepGoing = false;

                        } else {

                            player2HP -= player1Power;

                            if (player2HP <= 0) {
                                System.out.println("Player 1 is the winner.\n");
                                player1Wins++;
                                keepGoing = false;
                            }
                        }
                    }
                }
            }
            System.out.println("Player 1: " + player1Wins);
            System.out.println("Player 2: " + player2Wins);
            System.out.println("");
;
        }

        System.out.println("Final Scores: \n" + "--------------");
        System.out.println("Player 1 won " + player1Wins + " times(s).");
        System.out.println("PLayer 2 won " + player2Wins + " times(s).");

        if(player1Wins > player2Wins) {
            System.out.println("PLayer 1 has won the game!");
        }
        else if(player2Wins > player1Wins) {
            System.out.println("Player 2 has won the game!");
        }
    }
}