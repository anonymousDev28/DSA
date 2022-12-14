
public class Quang_217 {
    public static void main(String[] args) {
        int[] test = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        int[] test = {3, 3};
        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int len = nums.length;
        // selection sort
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    //swap elements
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }

            }
        }
        // duyệt từ đầu đến cuối mảng
        for (int i = 0; i < len - 1; i++) {
            // 2 phần tử liền kề bằng nhau thì return true
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        // không tồn tại cặp thỏa mãn thì return false
        return false;
    }
}
