public class ValidPalindrome {

    public static boolean validPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
}
