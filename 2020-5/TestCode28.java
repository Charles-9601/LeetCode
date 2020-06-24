//实现strStr()
public class TestCode28 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ll";
        //strStr(str1,str2);
        strStr1(str1,str2);
    }
    public static int strStr(String haystack, String needle){
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;
        for (int i =0;i <= haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                System.out.println("匹配成功！");
                return i;
            }
        }
        System.out.println("匹配不成功！");
        return -1;
    }
    public static int strStr1(String haystack,String needle){
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;
        int i = haystack.indexOf(needle);
        return i;
    }
}
