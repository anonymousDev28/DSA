public class Quang_75 {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
    public static void sortColors(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int temp,i =0;
        while(i < nums.length) {
            // đưa các số 0 về đầu mảng
            if (nums[i] == 0 && i != startIndex) {
                // swap
                temp = nums[i];
                nums[i] = nums[startIndex];
                nums[startIndex] = temp;
                // tăng start Index lên 1
                startIndex= startIndex+1;
                // đưa các số 2 về cuối mảng
            } else if (nums[i] == 2 && i < endIndex) {
                //swap
                temp = nums[i];
                nums[i] = nums[endIndex];
                nums[endIndex] = temp;
                // giảm end index xuống 1
                endIndex=endIndex-1;
            } else {
                i++;
            }
        }
    }
}
