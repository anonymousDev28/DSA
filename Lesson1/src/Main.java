public class Main {
    public static void main(String[] args) {
//        int[] arr = {2,2,1};
//        int[] arr = {4,1,2,1,2};
        int[] arr = {1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
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
