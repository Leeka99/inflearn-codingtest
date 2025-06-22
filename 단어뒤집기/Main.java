package 단어뒤집기;
import java.util.ArrayList;
import java.util.Scanner;

// (방법 1)StringBuilder의 reverse() 함수를 이용해서 풀 수도 있다. 
// -> String s = new StringBuilder(문자열).reverse().toString // StringBuilder 객체 생성 후 뒤집기 후 String으로 변환

// String이 있는데 StringBuiler 객체를 만들어서 사용하는이유
// String은 불변객체 -> 한 번 생성되면 내용을 바꿀 수 없다. 문자열을 수정하는 것 처럼 보이지만 사실은 새로운 객체를 계속 생성하는 것이다.
// StringBuilder는 가변객체 -> 내부적으로 버퍼를 사용해서 문자열을 효율적으로 조작한다. 같은 객체 안에서 문자열을 계속 변경하므로, 성능이 뛰어나다.
// (추가) StringBuffer도 있다.StringBuilder와 비슷하지만 멀티스레드 환경에 적합하다.

// (방법 2) toCharArray()를 사용한 뒤 직접 reverse 구현(첫번째와 마지막 교환)
/**
 * char[] s = x.toCharArray();
 * int lt = 0; rt = x.length() - 1;
 * while(lt < rt) {
 *  char tmp = s[lt];
 *  s[lt] = s[rt];
 *  s[rt] = tmp;
 *  lt++;
 *  rt--;
 * }
 */


public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    ArrayList<String> array = new ArrayList<>();

    for (int i = 0; i < input1; i++) {
        String s = in.next();
        array.add(s);
    }

        for (String s : array) {
            String reverse = "";
            for (int i  = s.length() - 1; i >= 0; i--) {
                reverse += s.charAt(i);
            }
            System.out.println(reverse);
        }
  }
}