public class Quang_2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        int[] store_frequency = new int[150];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // convert char to ascii code
            int index = (int)s.charAt(i);
            // increse store_frequency[index] have index = ascii code of char element
            store_frequency[index]++;
            if(store_frequency[index] == 2)
                return s.charAt(i);
        }
        return s.charAt(0);
    }
}
