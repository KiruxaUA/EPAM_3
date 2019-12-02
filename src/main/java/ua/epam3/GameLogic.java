package ua.epam3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class GameLogic {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static boolean isContinue;

    void startGame() {
        System.out.println("Hello! You are playing Rock, Paper, Scissors.");
        System.out.print("What's your name bro: ");
        String name = sc.nextLine();
        Player player = new Player(name);
        Computer computer = new Computer();

        do {
            player.setPlayersChoice(getPlayersChoice(player));
            computer.setComputerChoice(getComputersChoice());
            checkResult(player, computer);
            isContinue = getContinue();
        } while (isContinue);
    }

    private String getPlayersChoice(Player player) {
        System.out.print("Ok, " + player.getPlayerName() + " let's choose an item " +
                "(rock, paper or scissors): ");
        String playersChoice = sc.nextLine();
        while (!(playersChoice.equalsIgnoreCase(CHOICES.ROCK.getChoice()) ||
            playersChoice.equalsIgnoreCase(CHOICES.PAPER.getChoice()) ||
            playersChoice.equalsIgnoreCase(CHOICES.SCISSORS.getChoice()))) {
            playersChoice = sc.nextLine();
        }
        return playersChoice;
    }

    private String getComputersChoice() {
        String[] items = {"rock", "paper", "scissors"};
        return items[random.nextInt(items.length)];
    }

    private void checkResult(Player player, Computer computer) {
        if (player.getPlayersChoice().equals(CHOICES.ROCK.getChoice()) &&
                    computer.getComputerChoice().equals(CHOICES.SCISSORS.getChoice())) {
            System.out.println("You crashed the computer's scissors. Well done!");
        }
        else if (player.getPlayersChoice().equals(CHOICES.SCISSORS.getChoice()) &&
                computer.getComputerChoice().equals(CHOICES.PAPER.getChoice())) {
            System.out.println("You cut the computer's paper. Well done!");
        }
        else if (player.getPlayersChoice().equals(CHOICES.PAPER.getChoice()) &&
                computer.getComputerChoice().equals(CHOICES.ROCK.getChoice())) {
            System.out.println("You wrapped the computer's rock. Well done!");
        }
        else if (player.getPlayersChoice().equals(computer.getComputerChoice())) {
            System.out.println("It's a tie. " + player.getPlayersChoice() + " == " +
                    computer.getComputerChoice());
        }
        else {
            System.out.println("You lost. " + player.getPlayersChoice() + " <- " +
                    computer.getComputerChoice());
        }
    }

    private boolean getContinue() {
        boolean isContinue = false;
        try {
            System.out.print("Do you want to play again? (true, false) ");
            isContinue = sc.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Please enter (0 or 1) to continue!");
        }
        return isContinue;
    }
}
