package 회문문자열;
import java.util.Scanner;

// 회문 문자열 (팰린더롬 ) : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열

/**
 * 추가 답압 1 : 전체 길이를 1/2로 나누고 양끝의 문자가 같은지 비교한다.
 * String answer = "YES";
 * for (int i = 0; i < len / 2; i++) {
 * if (str.charAt(i) != str.charAt(len - i - 1)) return "No"
 * }
 * return answer;
 */

 /**
  * 추가 답안 2 : StringBuilder를 이용해서 reverse한뒤 equals()로 비교 + equalsIgnoreCase() 사용
  * -> equalsIgnoreCase() : 두 문자열이 대소문자 구분 없이 같은지 비교하는 메서드
  * String answer = "No";
  * String str = "hooh";
  * String tmp = StringBuilder(str).reverse().toString();
  * if (str.equalsIgnoreCase(tmp)) answer = "YES";
  */
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.next().toLowerCase();

    int s = 0;
    int e = input.length() - 1;
    String answer = "YES";
    while (s < e) {
        if (input.charAt(s) != input.charAt(e)) {
            answer = "NO";
        }
        s++;
        e--;
    }
    System.out.println(answer);
  }
}
