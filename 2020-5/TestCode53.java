//最大子序和
public class TestCode53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums){
        int maxNum = nums[0];
        int maxEnding = nums[0];
        for (int i = 0;i < nums.length;i++){
            maxEnding = Math.max(maxEnding + nums[i],nums[i]);
            maxNum = Math.max(maxEnding,maxNum);
        }
        System.out.println(maxNum);
        return maxNum;
    }
}
