public class TestCode58 {
    public static void main(String[] args) {
        String str = "Hello word";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        s = s.trim();
        int n = s.length() - 1;
        while(n >= 0 && s.charAt(n) != ' '){
            System.out.println(s.charAt(n));
            n--;
        }
        return s.length() -n - 1;
    }
}
