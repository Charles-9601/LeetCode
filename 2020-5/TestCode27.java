//移除元素
import java.util.Arrays;

class TestCode27{
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        removeElement(nums,val);
    }
    public  static int removeElement(int[] nums,int val){
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j] != val){
                nums[i]=nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
        return i;
    }
}