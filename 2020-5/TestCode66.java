import java.lang.reflect.Array;
import java.util.Arrays;

//加一
public class TestCode66 {
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        plusOne(nums);
    }
    public static int[] plusOne(int[] nums){
        boolean carry = false;
        int len = nums.length;
        int[] temp = nums;
        if (nums[len-1]+1 == 10){
            carry = true;
            temp[len-1] = 0;
        }
        else{
            temp[len-1] += 1;
            System.out.println(Arrays.toString(temp));
            return temp;
        }
        for (int i = len-2;i >= 0;i--){
            if (carry && temp[i] + 1 == 10){
                temp[i] = 0;
                carry = true;
            }
            else if(carry){
                temp[i] += 1;
                carry = false;
            }
        }
        if (carry && temp[0] ==0){
            int[] res = new int[len + 1];
            System.out.println(Arrays.toString(res));
            res[0] = 1;
            System.out.println(Arrays.toString(res));
            return res;
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

}
