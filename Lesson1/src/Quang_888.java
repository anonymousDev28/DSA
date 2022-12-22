
public class Quang_888 {
    public static void main(String[] args) {
//        System.out.println();
        int[] result = fairCandySwap(new int[]{1,1},new int[]{2,2});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // merge sort
        sort(aliceSizes, 0, aliceSizes.length - 1);
        sort(bobSizes, 0, bobSizes.length - 1);
        int sumA = 0, sumB = 0;
        for (int i : aliceSizes)
            sumA += i;
        for (int i : bobSizes)
            sumB += i;
        int diffOfAns = (sumA - sumB) / 2;
        int[] answer = new int[2];
        // binary search
        for (int i = 0; i < aliceSizes.length; i++) {
            int left = 0, right = bobSizes.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (bobSizes[mid] == aliceSizes[i] - diffOfAns) {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[mid];
                    return answer;
                } else if (bobSizes[mid] > aliceSizes[i] - diffOfAns) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return answer;
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int lenA = mid - left + 1;
        int lenB = right - mid;
        int[] A = new int[lenA];
        int[] B = new int[lenB];
        for (int i = 0; i < lenA; ++i)
            A[i] = arr[left + i];
        for (int j = 0; j < lenB; ++j)
            B[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;
        // A và B đều khác rỗng
        while (i < lenA && j < lenB) {
            if (A[i] <= B[j]) {
                arr[k] = A[i];
                i++;
            } else {
                arr[k] = B[j];
                j++;
            }
            k++;
        }
        // chỉ còn mảng A
        while (i < lenA) arr[k++] = A[i++];
        // chỉ còn mảng B
        while (j < lenB) arr[k++] = B[j++];
    }

    public static int[] sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }
}
