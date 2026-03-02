public class RemoveOuterParan {

    public static String removeOuterParan(String s){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    result.append(ch);
                }
                count++;
            } 
            else {
                count--;
                if (count > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String s = "(()())(()))";
        System.out.println(removeOuterParan(s));
    }
}
