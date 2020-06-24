import sun.text.normalizer.UCharacter;

public class TestCode125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){
     int i = 0;
     int j = str.length()-1;
     char[] chars = str.toCharArray();
     while(i<j){
         while(i<j && !Character.isLetterOrDigit(chars[i])){
             i++;
         }
         while(i<j && !Character.isLetterOrDigit(chars[j])){
             j--;
         }
         if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])){
             return false;
         }
         i++;
         j--;
     }
     return true;
    }
}
