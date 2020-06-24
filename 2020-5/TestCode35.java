//搜索插入位置
public class TestCode35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        searchIndex(nums,target);

    }
    public static int searchIndex(int[] nums,int target){
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        else{
            for (int i = 0;i < len;i++){
                if (nums[0] > target){
                    System.out.println(0);
                    return 0;
                }
                else if (nums[len-1] < target){
                    System.out.println(len);
                    return len;
                }
                else if (nums[i] == target){
                    System.out.println(i);
                    return i;
                }
                else if(nums[i] < target && nums[i+1] > target){
                    System.out.println(i+1);
                    return i+1;
                }
            }
            return len;
        }
    }
}
