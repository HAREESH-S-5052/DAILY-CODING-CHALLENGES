class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int m=1;
        int t=n;
        while (n!=0){
            int r=n%10;
            s+=r;
            m*=r;
            n/=10;
        }
        return t%(s+m)==0;
    }
}