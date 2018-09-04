class Solution {
    public int reverse(int x) {
        int num = 0;
        while (x != 0) {
            if (Math.abs(num) > (Integer.MAX_VALUE - Math.abs(x % 10)) / 10) {
                return 0;
            }
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }
}
