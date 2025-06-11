import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        boolean[] visited = new boolean[game.length];
        return canWinFrom(0, leap, game, visited); // Start from index 0
    }

    private static boolean canWinFrom(int i, int leap, int[] game, boolean[] visited) {
        // Win condition: jump beyond the last index
        if (i >= game.length) return true;

        // Fail conditions: out of bounds, blocked, or already visited
        if (i < 0 || game[i] == 1 || visited[i]) return false;

        // Mark this index as visited
        visited[i] = true;

        // Explore all possible moves
        return canWinFrom(i + leap, leap, game, visited) ||  // Jump
               canWinFrom(i + 1, leap, game, visited) ||     // Step forward
               canWinFrom(i - 1, leap, game, visited);       // Step backward
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();  // Number of queries

        while (q-- > 0) {
            int n = scan.nextInt();       // Array size
            int leap = scan.nextInt();    // Leap distance

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt(); // Read game array
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }

        scan.close();
    }
}
