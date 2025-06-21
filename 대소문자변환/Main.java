package 대소문자변환;
import java.util.Scanner;

// 나의 기존 생각 : 아스키코드로 변환해서 97이상이면 소문자로 판단해야하나?
// Character.isLowerCase() : 문자가 소문자인지 확인하는 메서드 활용하면 간단하다.

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();

    String answer = "";
    for (char c : input1.toCharArray()) {
        if (Character.isLowerCase(c)) {
            answer += Character.toUpperCase(c);
        }

        if (Character.isUpperCase(c)) {
            answer += Character.toLowerCase(c);
        }
    }
    System.out.println(answer);

  }
}