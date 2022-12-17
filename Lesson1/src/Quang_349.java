public class Quang_349 {
    public static void main(String[] args) {
        int[] test = {1,2,2,1};
        int[] test2 = {2,2};
        int[] a = intersection(test2,test);
        for (int j : a) {
            System.out.println(j + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        for (int i = 0; i < len1; i++) {
            int j = 0;
            while (j < len2){
                if(nums1[i] != nums2[j]) j++;
                        else j = len2;
            }
            // không tồn tại phần tử nums1[i] trong mảng nums2 thì xóa nums1[i]
            // nums1[i] = nums1[i+1]
            for (int k = i; k < len1-1; k++) {
                nums1[i] = nums1[i+1];
            }
            // gán phần tử cuối = -1
            nums1[len1-1] = -1;
        }
        return nums1;
    }

}
