public class TestCode67 {
    public static void main(String[] args) {
        String a = "11",b = "1";
        addBinary(a,b);
        System.out.println(addBinary(a,b));
        System.out.println(addBinary1(a,b));

    }
    public static String addBinary(String a,String b){
        StringBuilder ans = new StringBuilder();
        int ca = 0;//判断是否进一位
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--){
            int sum = ca;
            sum += (i >= 0 ? a.charAt(i) - '0' : 0); // 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            sum +=( j >= 0 ? b.charAt(j) - '0' : 0);// 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            ans.append(sum % 2);  //如果二者都为1  那么sum%2应该刚好为0 否则为1
            ca = sum / 2;   //如果二者都为1  那么ca 应该刚好为1 否则为0
        }
        ans.append(ca == 1 ? ca : "");// 判断最后一次计算是否有进位  有则在最前面加上1 否则原样输出
        return ans.reverse().toString();

    }

    public static String addBinary1(String a,String b){
        int carry = 0;
        int i=a.length()-1,j=b.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum += (a.charAt(i) - '0');
                i--;
            }
            if(j>=0){
                sum += (b.charAt(j) - '0');
                j--;
            }
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}
