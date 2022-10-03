import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("   * Welcome to Minesweeper! *\n" +
                           "       * by Matthew Calder *\n" +
                           "-----------------------------------");

        // initialize GUI
        new GUI();

        // Choose mode
        int difficulty = chooseMode();


        // Draw map
        drawMap(difficulty);

        // While true
            // Ask for tile
            // Check for bomb - break

        // You win: maybe time taken?
    }

    public static int chooseMode() {
    // Takes input from the user and does something if given e,m,h, else loop input request
    // Returns difficulty Easy: 0, Medium: 1, Hard: 2

        // Parse input
        Scanner scanner = new Scanner(System.in);

        // Continue to ask for input until valid diff chosen
        while (true) {
            System.out.println("Please choose a difficulty: (e/m/h)");
            String check = scanner.nextLine();
            switch (check) {
                case "e": {
                    System.out.println("Drawing Easy Level");
                    return 0;}
                case "m": {
                    System.out.println("Drawing Medium Level");
                    return 1;}
                case "h": {
                    System.out.println("Drawing Hard Level");
                    return 2;}
                case "x": {
                    System.exit(0);
                }

                default: {
                    System.out.println("Please select valid input or exit with 'x'");}
            }


        }
    }

    public static void drawMap(int diff) {

        char [] [] easyMap = {{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},};

        switch (diff) {
            case 0: {
                for (char[] row : easyMap) {
                    for (char c: row) {
                        System.out.print(c);
                    }
                    System.out.println("");
                }
                break;
            }

            case 1: {
                System.out.println(" This is a Medium map");
                break;
            }

            case 2: {
                System.out.println(" This is a Hard map");
                break;
            }
        }
    }
}