
public class Quang_268 {
    public static void main(String[] args) {
        int[] a = {3,2,4,0,5};
        System.out.println(missingNumber2(a));
    }
    // selection sort
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    // cách 1:sử dụng binary search
    public static int missingNumber(int[] nums) {
        selectionSort(nums);
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
    // cách 2 : sử dụng sum
    public static int missingNumber2(int[] nums) {
        selectionSort(nums);
        int len = nums.length;
        if(len > nums[len-1])
            return len;
        int sumMissedArray = 0;
        for (int num : nums) {
            sumMissedArray += num;
        }
        int sumCompletedArray = nums[len - 1] * (nums[len - 1] + 1) / 2;
        return sumCompletedArray - sumMissedArray;
    }

}
