import java.util.HashMap;
import java.util.Map;

public class TestCode219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containNearbyDuplicate(nums,k));
    }

    public static boolean containNearbyDuplicate(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                if (i-map.get(nums[i]) <= k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
