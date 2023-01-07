package HashTable;

import java.util.HashSet;
import java.util.Set;

public class Quang_771 {
    // using hashset
    //time complexity: 0(n)
    //space comlexity: O(n)
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> hashSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(hashSet.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
    // using hashset
    //time complexity: 0(n)
    //space comlexity: O(1)
    public int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        for (int i: stones.toCharArray())
            if(jewels.indexOf(i) !=-1)
                count++;
        return count;
    }
}
