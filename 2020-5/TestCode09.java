//回文数
public class TestCode09 {
    public static void main(String[] args) {
        isPalindrome(-121);
        isPalindrome(121);
        isPalindrome(232);
        isPalindrome(222);
        isPalindrome(123);
    }

    public static boolean isPalindrome(int x){
        if (x==0){
            return true;
        }
        else if(x<0){
            return false;
        }
        int ren = 0;
        int temp = x;
        while(temp != 0){
            ren *= 10;
            ren += temp%10;
            temp = temp/10;
        }
        System.out.println(ren == x);
        return ren == x;
    }
}
