public class Quang_1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        System.out.println(runningSum(nums));
        int[] result = runningSum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +" ");
        }

    }
    public static int[] runningSum(int[] nums) {
        int b[] = new int[nums.length];
        b[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            b[i] = b[i-1]+nums[i];
        }
        return b;
    }
}
