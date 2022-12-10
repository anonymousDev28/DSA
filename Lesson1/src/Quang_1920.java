public class Quang_1920 {
    public int[] buildArray(int[] nums) {
        int lengthA = nums.length;
        int[] result = new int[lengthA];
        for(int i = 0; i< lengthA ; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
