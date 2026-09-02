import java.math.BigInteger;

class Solution {
    public int sumDecoded(long[] nums) {

        BigInteger MOD = BigInteger.valueOf(1000000007L);
        BigInteger sum = BigInteger.ZERO;

        for (long num : nums) {

            int width = (int)(num % 10);
            long d = num / 10;

            String s = String.valueOf(d);

            long x = Long.parseLong(s.substring(0, width));
            long y = Long.parseLong(s.substring(width));

            BigInteger X = BigInteger.valueOf(x);
            BigInteger Y = BigInteger.valueOf(y);

            BigInteger value = X.modPow(Y, MOD);

            sum = sum.add(value).mod(MOD);
        }

        return sum.intValue();
    }
}
