// 443. String Compression

public class StringCompression {

    public static int stringCompression(char chars[]){
        int idx = 0;
        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            int count = 1;
            while(i<chars.length-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[idx] = ch;
            idx++;
            if(count > 1){
                String num = String.valueOf(count);
                for(int j=0; j<num.length(); j++){
                    chars[idx] = num.charAt(j);
                    idx++;
                }
            }
        }
        return idx;
    }
    public static void main(String args[]){
        char chars[] ={'a','a','b','b','c','c','c'};
        int newLength = stringCompression(chars);
        System.out.println(newLength);

        // Print compressed array
        for(int i = 0; i < newLength; i++){
            System.out.print(chars[i] + " ");
        }
    }
}
