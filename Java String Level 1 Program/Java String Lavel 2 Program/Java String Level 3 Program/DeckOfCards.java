import java.util.Scanner;

class DeckOfCards {

    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    static String[] initializeDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[index++] = r + " of " + s;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        String[][] result = new String[players][n / players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n / players; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        String[][] result = distribute(deck, n, players);
        if (result == null) System.out.println("Cannot distribute equally!");
        else {
            for (int i = 0; i < players; i++) {
                System.out.print("Player " + (i+1) + ": ");
                for (String card : result[i]) System.out.print(card + ", ");
                System.out.println();
            }
        }
        sc.close();
    }
}
