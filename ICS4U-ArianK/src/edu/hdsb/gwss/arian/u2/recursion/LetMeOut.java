/*
 * Name:            Let Me Out
 * Date:            Nov, 2014
 */
package edu.hdsb.gwss.arian.u2.recursion;

public class LetMeOut {

    private static final char WALL = 'W';
    private static final char EXIT = 'X';
    private static final char OPEN = '.';
    private static final char TRIED = '-';
    private static final char GOOD_PATH = '+';

    private char[][] maze = {
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', '.', '.', 'W', '.', '.', '.', '.', '.', '.', '.', 'W'},
        {'W', '.', 'W', '.', 'W', '.', 'W', 'W', 'W', '.', 'W', 'W', 'W'},
        {'W', '.', 'W', '.', '.', '.', 'W', 'W', '.', '.', '.', '.', 'W'},
        {'W', 'W', 'W', '.', 'W', '.', 'W', 'W', '.', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', 'W', 'W', 'W', 'W', '.', '.', '.', '.', '.', 'W'},
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'X', 'W', 'W', 'W'}
    };

    /**
     * Display the current maze.
     */
    public boolean findExitFrom(int row, int col) {
        char location = maze[row][col];
        char right = maze[row][col + 1];
        char left = maze[row][col - 1];
        char up = maze[row - 1][col];
        char down = maze[row + 1][col];
        boolean successful = false;

//        if (location == EXIT) {
//            successful = true;
//            return successful;
//        }
//
//        if (location != OPEN) {
//            successful = false;
//            return successful;
//        }
//        maze[row][col] = GOOD_PATH;
        if (row == 6 && col == 9) {
            System.out.println("lol");
        }
        if (maze[row][col + 1] == OPEN) {
            maze[row][col + 1] = TRIED;
            findExitFrom(row, col + 1);
        }
        if (maze[row][col - 1] == OPEN) {
            maze[row][col - 1] = TRIED;
            findExitFrom(row, col - 1);
        }
        if (maze[row - 1][col] == OPEN) {
            maze[row - 1][col] = TRIED;
            findExitFrom(row - 1, col);
        }
        if (maze[row + 1][col] == OPEN) {
            maze[row + 1][col] = TRIED;
            findExitFrom(row + 1, col);
        }

        if (maze[row][col + 1] == EXIT) {
            maze[row][col + 1] = TRIED;
              System.out.println("lol");
            findExitFrom(row, col);
        }
        if (maze[row][col - 1] == EXIT) {
            maze[row][col - 1] = TRIED;
              System.out.println("lol");
            findExitFrom(row, col);
        }
        if (maze[row - 1][col] == EXIT) {
            maze[row - 1][col] = TRIED;
              System.out.println("lol");
            findExitFrom(row, col);
        }
        if (maze[row + 1][col] == EXIT) {
            maze[row + 1][col] = TRIED;
              System.out.println("lol");
            findExitFrom(row, col);
        }

        maze[row][col] = GOOD_PATH;

        return successful;
    }

    /**
     * Display the current maze.
     */
    public void solve() {

        // FIND RANDOM START LOCATION
        int row;
        int col;
        do {
            row = (int) (Math.random() * maze.length);
            col = (int) (Math.random() * maze[0].length);
        } while (maze[row][col] != OPEN);

        // START!
        System.out.println("START LOCATION: (" + row + "," + col + ")");
        findExitFrom(row, col);

        // SHOW EXIT
        displayMaze();

    }

    /**
     * Display the current maze.
     */
    public void displayMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LetMeOut lmo = new LetMeOut();
        lmo.displayMaze();
        lmo.solve();

    }

}
