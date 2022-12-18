public class Quang_35 {
    public static void main(String[] args) {
        int[] test = {1, 3, 5};
        System.out.println(searchInsert(test, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 2;
        // target == nums[len-1]
        if (nums[len - 1] == target)
            return len - 1;
            // target > nums[len-1]
        else if (nums[len - 1] < target)
            return len;
            // nums[0] > target
        else if (nums[0] > target)
            return 0;
            // target < nums[len - 1]
        else {
            while (left <= right) {
                int mid = (left + right) / 2;
                if (target == nums[mid])
                    return mid;
                // [mid+1;right]
                else if (target > nums[mid]){
                    left = mid + 1;
                }
                // [left;mid-1]
                else{
                    right = mid - 1;
                }
            }
        }
        return left;
    }
}
