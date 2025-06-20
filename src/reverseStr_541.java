import java.util.Scanner;

public class reverseStr_541 {
    public String solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i+=2*k){
            if(i+k < ch.length){
                resverse(ch, i, i+k-1);
                continue;
            }
            resverse(ch, i, ch.length-1);
        }
        return new String(ch);

    }
    public void resverse(char[] ch,int start,int end){
        while(start < end){
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }
}
