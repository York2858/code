import java.util.ArrayList;
import java.util.List;

class restoreIpAddresses_93 {
    List<String> res = new ArrayList<>();

    public List<String> solution(String s) {
        if (s.length() < 4 || s.length() > 12)
            return res;
        StringBuilder sb = new StringBuilder(s);
        backing(sb, 0, 0);
        return res;
    }

    public void backing(StringBuilder s, int startIndex, int pointNum) {
        if (pointNum == 3) {
            if (isVaild(s, startIndex, s.length() - 1)) {
                res.add(new String(s));
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isVaild(s, startIndex, i)) {
                s.insert(i + 1, '.');
                backing(s, i + 2, pointNum + 1);
                s.deleteCharAt(i + 1);
            } else {
                break;
            }
        }
    }

    public boolean isVaild(StringBuilder s, int start, int end) {
        if(start > end) return false;
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            num = num * 10 + s.charAt(i) - '0';
        }
        if (num > 255)
            return false;
        return true;
    }
}