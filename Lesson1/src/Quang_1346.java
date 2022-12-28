import java.util.Arrays;

public class Quang_1346 {
    public static void main(String[] args) {
        System.out.println(checkIfExist1(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }

    public static boolean checkIfExist1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] == 2 * arr[j]) || (arr[j] == 2 * arr[i])) {
                    return true;
                }
            }
        }
        //Time complexity: O(n^2)
        //Space complexity: O(1)
        return false;
    }

}
