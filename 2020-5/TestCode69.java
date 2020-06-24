public class TestCode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x){
        int left = 0;
        int right = x/2+1;
        while(right > left){
            int mid = left + (right - left +1) / 2;
            int square = mid * mid;
            if(square > x){
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return (int)left;
    }
}
