class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (n * 2) + (n * 3);

char[] arr = s.toCharArray();
Arrays.sort(arr);

char[] target = {'1','2','3','4','5','6','7','8','9'};

return Arrays.equals(arr, target);
    }
}