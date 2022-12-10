public class Quang_136 {
    public int singleNumber(int[] nums) {
        int result = -1;
        int length = nums.length;
        for(int i = 0;i < length;i++){
            int count = 0;
            for(int j = 0;j<length;j++){
                if(nums[i]==nums[j]){
                    ++count;
                }
            }
            if(count == 1){
                result = nums[i];
            }
        }
        return result;
    }
}
