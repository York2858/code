import java.util.Scanner;

public class removeDuplicates_1047_X {
    public String solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(sb.length() > 0 && c == sb.charAt(sb.length() - 1)){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
