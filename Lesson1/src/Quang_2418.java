

public class Quang_2418 {
    public static void main(String[] args) {
        String[] result = sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static String[] sortPeople(String[] names, int[] heights) {
        // tạo mảng 2 chiều lưu chiều cao + index trong mảng tên
        int[][] people = new int[names.length][2];
        for (int i = 0; i < names.length; i++)
            people[i] = new int[]{heights[i], i};
        // sắp xếp giảm dần theo chiều cao
        // sort sử dụng merge sort
        mergeSort(people,0, people.length-1,0);
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++)
            result[i] = names[people[i][1]];
        return result;
    }
    public static void merge(int[][] arr, int start, int mid, int end, int index) {
        int i, j, k;
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int columnLength = arr[0].length;
        int [][] leftSubArray = new int [n1][columnLength];
        int [][] rightSubArray = new int [n1][columnLength];

        // copy phần tử từ Temp sang LeftSubArray
        for (i = 0; i < n1; i++) {
            for (j = 0; j < columnLength; j++) {
                leftSubArray[i][j] = arr[start + i][j];
            }
        }

        // copy phần tử từ Temp sang RightSubArray
        for (i = 0; i < n2; i++) {
            for (j = 0; j < columnLength; j++) {
                rightSubArray[i][j] = arr[mid + 1 + i][j];
            }
        }

        i = j = k = 0;
        while(i < n1 && j < n2) {
            if (leftSubArray[i][index] >= rightSubArray[j][index]) {
                arr[start + k] = leftSubArray[i];
                i++;
            } else {
                arr[start + k] = rightSubArray[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[start + k] = leftSubArray[i];
            i++;
            k++;
        }
        while(j < n2 && (start + k) < end) {
            arr[start + k] = rightSubArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[][] arr, int start, int end, int index) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid, index);
        mergeSort(arr, mid + 1, end, index);
        merge(arr, start, mid, end, index);
    }
}
