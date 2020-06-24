/*
* 异或运算，同为0，异为1；[0,n]中所有的数异或的结果和目标数组异或的结果再次异或，
* 得到的就是目标数组中缺失的数字，因为缺失的数字只在[0,n]中出现一次。
* */
//缺失数字
public class TestCode268 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int xor = 0;
        int i = 0;
        for(;i<nums.length;i++){
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}