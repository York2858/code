import java.util.Scanner;

public class canConstruct_383 {
    public boolean solution(){
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();
        int[] r = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            r[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            if(r[magazine.charAt(i) - 'a'] != 0){
                r[magazine.charAt(i) - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(r[i] != 0){
                return false;
            }
        }
        return true;
    }
}
