class Sqrtt {
    public static void main(String[] args) {
        int n=16;
        System.out.println(mySqrt(n));
        
        
    }
    public static int mySqrt(int n) {
        // By Binary Approach
        long st = 1 , end = n ,  mid = (st + end) / 2;
        while(st <= end) {
            if(mid * mid == n) {
                break;
            }else if (mid * mid > n) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
            mid = (st + end) / 2;
        }
        return (int)mid;
    }
}