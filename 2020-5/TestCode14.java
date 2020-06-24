//最长公共前缀
public class TestCode14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        longCommonPrefix(strs);
    }
    public static String longCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        int i=0;
        String prefix = "";
        String result;
        boolean broken = false;
        while(true){
            i++;
            result = prefix;
            if(i > strs[0].length()){
                break;
            }
            prefix = strs[0].substring(0,i);
            for(String word:strs){
                if(i>word.length() || !word.startsWith(prefix)){
                    broken = true;
                    break;
                }
            }
            if (broken){
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
