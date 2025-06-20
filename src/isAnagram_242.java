import java.util.Scanner;

public class isAnagram_242 {
    public boolean solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] arrs = new int[26];
        int[] arrt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arrt[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(arrs[i] != arrt[i]){
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
}
