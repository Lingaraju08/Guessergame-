import java.util.Scanner;

class Guesser {
    int gnum;

    int guessNum() {
        System.out.println("Guesser, guess the number between 1 to 20:");
        Scanner s = new Scanner(System.in);
        gnum = s.nextInt();
        return gnum;
    }
}

class Players {
    int pnum;

    int playerNum() {
        System.out.println("Player, guess the number between 1 to 20:");
        Scanner s = new Scanner(System.in);
        pnum = s.nextInt();
        return pnum;
    }
}

class Umpire {
    int g1num;
    int p1num;
    int p2num;
    int p3num;

    void collectGuesserNumber() {
        Guesser g = new Guesser();
        g1num = g.guessNum();
    }

    void collectPlayersNumber() {
        Players p1 = new Players();
        System.out.println("Player 1, your guess:");
        p1num = p1.playerNum();

        Players p2 = new Players();
        System.out.println("Player 2, your guess:");
        p2num = p2.playerNum();

        Players p3 = new Players();
        System.out.println("Player 3, your guess:");
        p3num = p3.playerNum();
    }

    void compare() {
        if (g1num == p1num) {
            System.out.println("Player 1 wins!");
        } else if (g1num == p2num) {
            System.out.println("Player 2 wins!");
        } else if (g1num == p3num) {
            System.out.println("Player 3 wins!");
        } else {
            System.out.println("Game over! No correct guess.");
        }
    }
}

class GuesserGameLaunch {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectGuesserNumber();
        u.collectPlayersNumber();
        u.compare();
    }
}
