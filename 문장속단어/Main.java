package 문장속단어;
import java.util.Scanner;

// .next()는 공백을 기준으로 공백전까지의 문자열을 받아온다.
// .nextLine()은 공백 포함 한줄의 문자열을 모두 받아온다.
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.nextLine();

    String answer = "";
    for (String s : input1.split(" ")) {
        if (answer.length() < s.length()) {
            answer = s;
        }
    }
    System.out.println(answer);
  }
}