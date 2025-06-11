import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read initial list size and elements
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            String action = scanner.next();  // "Insert" or "Delete"

            if (action.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (action.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        // Print final list
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
