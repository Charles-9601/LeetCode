import java.util.HashSet;
import java.util.Set;

//存在重复元素
public class TestCode217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        if (nums == null || nums.length == 0){
            return false;
        }
        Set<Integer>set = new HashSet();
        for(int i:nums){
            if (!set.add(i)){
                return true;
            }
        }
        return false;

    }
    /*
    public static boolean containsDuplicate(int[] nums){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j]){
                    System.out.println("含有重复的数字");
                    return true;
                }
            }
        }
        System.out.println("不存在重复的数字!");
        return false;
    }*/
}
