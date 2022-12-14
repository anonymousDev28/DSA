import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quang_217 {
    public static void main(String[] args) {
        int[] test = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        int[] test = {3, 3};
        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int len = nums.length;
        //sort by selection sort
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
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
