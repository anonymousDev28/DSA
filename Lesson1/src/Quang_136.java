public class Quang_136 {
    public int singleNumber(int[] nums) {
        int result = -1;
        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
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
