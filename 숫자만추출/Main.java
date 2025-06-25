package 숫자만추출;
import java.util.Scanner;

// 방법 1 (초기값) answer = 0 , answer * 10 + (x - 48) 이용하기
// 0,1,2,0,5 가 주어졌다면 
// answer = 0 , 0 * 10  + (48 - 48) = 0
// answer = 0 , 0 * 10  + (49 - 48) = 1
// answer = 1 , 0 * 10  + (50 - 48) = 12
// answer = 12 , 0 * 10  + (48 - 48) = 120
// answer = 120 , 0 * 10  + (53 - 48) = 1205

// 아스키코드 : '0' -> 48 , 'a' -> 97 , 'A' -> 65

// 방법 2 : Character.isDisit() + Integer.parseInt() 이용하기
// -> Character.isDisit() 숫자인지 판단 후 answer에 누적한다.
// -> 그 후 Integer.parseInt()로 변환하면 첫번째의 0은 사라진다.

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.next().toUpperCase();
    
    String answer = "";
    char[] arr = input.toCharArray();
    for (char c : arr) {
        if (Character.isDigit(c)) answer += c;
    }

    System.out.println(Integer.parseInt(answer));
  }
}