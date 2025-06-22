package 중복문자제거;

import java.util.Scanner;

// .indexOf()를 활용해서 해결하자. indexOf()는 첫 번째로 등장한 위치를 반환한다.
// -> 현재위치 == .indexOf() -> 위치가 같다면 중복없음.
// -> 현재위치 != .indexOf() -> 위치가 다르다면 중복있음.

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();
    int num = input1.length();

    String answer = "";
    for (int i = 0; i < num; i++) {
      if (i == input1.indexOf(input1.charAt(i))) {
        answer += input1.charAt(i);
      }
    }

    System.out.println(answer);
  }
}