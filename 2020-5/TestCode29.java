//两数相除，不使用除法，乘法，MOD
public class TestCode29 {
    public static void main(String[] args) {
        divide(10,3);

    }

    public static int divide(int dividend,int divisor){
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == 0)){
            return Integer.MAX_VALUE;
        }
        if (dividend != Integer.MIN_VALUE && Math.abs(dividend) < Math.abs(divisor)){
            return 0;
        }
        if (divisor == Integer.MIN_VALUE){
            return(dividend == Integer.MAX_VALUE) ? 1 : 0;
        }
        boolean flag = (dividend < 0)^(divisor < 0);
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int[] num = new int[40];
        int[] multiple = new int[40];
        num[1] = divisor;
        multiple[1] = 1;

        for (int i=2;i<32&num[i-1]<0;i++){
            num[i] = num[i-1]<<1;
            multiple[i] = multiple[i-1]<<1;
        }

        int result = 0;
        int index = 1;
        while (num[index]<0) {
            ++index;
        }

        while(dividend <= divisor){
            while(dividend <= num[index]){
                result += multiple[index];
                dividend -= num[index];
            }
            --index;
        }
        return !flag ? result : -result;
    }
}
