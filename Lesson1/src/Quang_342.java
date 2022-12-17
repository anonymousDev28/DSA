public class Quang_342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }
    public static boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        if (n % 4 != 0 || n < 4)
            return false;
        else if ( n > 4)
            return isPowerOfFour(n/4);
        else
            return true;
    }
}
