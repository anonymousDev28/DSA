public class Quang_1051 {
    public static void main(String[] args) {
        int[] test = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(test));
    }


    public static int heightChecker(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        // clone into new array
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        // sort by selection sort
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (b[j] < b[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int t = b[i];
                b[i] = b[minIndex];
                b[minIndex] = t;
            }
        }
        // compare a and b
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count;
    }
}
