import java.util.Arrays;

public class Quang_1346 {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int searchResult = binarySearch(arr, arr[i] * 2);
            if (searchResult != -1 && searchResult != i)
                return true;
        }
        return false;
    }

    public static int binarySearch(int[] a, int target) {
        int len = a.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] < target) {
                left = mid + 1;
            } else if (a[mid] == target) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
