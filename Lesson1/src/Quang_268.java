import java.util.Arrays;

public class Quang_268 {
    public static void main(String[] args) {
        int[] a = {3,2,4,0,5};
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = (left+right)/2;
            // nhận xét 1: sau khi sắp xếp 1 dãy [0;N] hoàn chỉnh <=> nums[i] == i;
            // nhận xét 2: nums[mid] == mid <=> [0;mid] hoàn chỉnh
            // => search [mid+1;right]
            if(mid == nums[mid])
                //[left;mid] đã hoàn chỉnh
                left = mid + 1;
            else
                //[mid;right] đã hoàn chỉnh
                right = mid - 1;
        }
        return left;
    }
}
