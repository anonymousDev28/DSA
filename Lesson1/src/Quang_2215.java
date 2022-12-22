import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quang_2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}).toString());
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> answer1=new ArrayList<>();
        List<Integer> answer2=new ArrayList<>();
        for (int value : nums1) {
            boolean flag = false;

            for (int i : nums2) {
                if (value == i) {
                    flag = true;
                }
            }
            if (!flag) {
                answer1.add(value);
            }
        }
        for (int j : nums2) {
            boolean flag = false;
            for (int k : nums1) {
                if (j == k) {
                    flag = true;
                }
            }
            if (!flag) {
                answer2.add(j);
            }

        }
        result.add(answer1.stream().distinct().collect(
                Collectors.toList()));
        result.add(answer2.stream().distinct().collect(
                Collectors.toList()));
        return result;
    }
}
