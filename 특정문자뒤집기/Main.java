package 특정문자뒤집기;
import java.util.Scanner;

// 어떻게 특수문자만 남기고 reverse 할 수 있을까
// -> 현재 가리키고 있는 문자가 알파벳인지 특수문자인지 확인하자.
// -> Character.isAlpabrtic(문자); 사용해서 해결하자.
// String.valueOf(문자배열) -> 기본형 데이터의 배열을 String화 시켜준다. static메서드이다.
// (참고) String.valueOf() 와 toString() 차이가 무엇일까
// -> .toString()은 null 값이 들어오면 NullPointerException 발생한다.
// -> String.ValueOf()는 null 값 들어와도 문자열로 null을 출력한다. 에러 발생하지 않는다.

/*
 * if (st == 특수문자) {
 *  st++;
 * }
 * else if (et == 특수문자) {
 *  et--;
 * }
 * else {
 *  교환
 * }
 */

 public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();

    char[] c = input1.toCharArray();
    int st = 0; int et = c.length - 1;

    String answer;
    while (st < et) {
        if (!Character.isAlphabetic(c[st])) {
            st++;
        }
        else if(!Character.isAlphabetic(c[et])) {
            et--;
        }
        else {
            char tmp = c[st];
            c[st] = c[et];
            c[et] = tmp;
            st++;
            et--;
        }
    }
    answer = String.valueOf(c);
    System.out.println(answer);
  }
}