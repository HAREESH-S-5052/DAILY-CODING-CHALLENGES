class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;

        String binary = Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }

        return Integer.parseInt(ans.toString(), 2);
    }
}