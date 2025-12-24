package Day_01;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;      // handle 0 and negatives
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;                 // true only if reduced to 1
    }
}
