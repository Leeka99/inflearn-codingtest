package 문자열압축;
import java.util.ArrayList;
import java.util.Scanner;

// 방법 1 : i 와 i+1이 같은지 확인
// -> s.charAt(i) == s.charAt(i + 1)
// 어떤 타입이든 문자로 바꾸는 법  : String.valueOf();
// 숫자에서 문자로 바꾸는 법 : Integer.toString();

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s = in.next();

    char c = s.charAt(0);
    ArrayList<Character> arr = new ArrayList<>();
    arr.add(s.charAt(0));
    int cnt = 1;
    for (int i = 1; i < s.length(); i++) {
        if (c == s.charAt(i)) cnt++;
        else if (c != s.charAt(i)) {
            if (1 < cnt) arr.add(Integer.toString(cnt).charAt(0));
            arr.add(s.charAt(i));
            cnt = 1;
            c = s.charAt(i);
        }
    }

    if (1 < cnt) arr.add(Integer.toString(cnt).charAt(0));

    for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i));
    }
  }
}