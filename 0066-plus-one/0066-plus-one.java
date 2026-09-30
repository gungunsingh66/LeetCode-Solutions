import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger number = BigInteger.ZERO;
        for (int digit : digits) {
            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }
        number = number.add(BigInteger.ONE);
        String str = number.toString();
        int[] intArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            intArr[i] = str.charAt(i) - '0';
        }
        return intArr;
    }
}