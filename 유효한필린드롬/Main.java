package 유효한필린드롬;
import java.util.Scanner;

// 알파벳만 고려해서 팰린더롬인지 검사하자.
// [^A-Z] -> 대문자 A~Z가 아니면 이라는 뜻. 정규표현식 사용
// replaceAll() 사용해보자

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s = in.nextLine();
    s = s.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(s).reverse().toString();

    String answer = "NO";

    if(s.equals(tmp)) answer = "YES";

    System.out.println(answer);
  }
}


// 프로그래머스 식 풀이
// public class Main {
  
//   public String Solution(String s) {
//     String answer = "NO";
//     s = s.toUpperCase().replaceAll("[^A-Z]", "");
//     String tmp = new StringBuilder(s).reverse().toString();
//     if(s.equals(tmp)) answer = "YES";

//     return answer;
//   }

//   public static void main(String[] args){
//     Main T = new Main();
//     Scanner in = new Scanner(System.in);
//     String s = in.nextLine();
//     System.out.println(T.Solution(s));

//   }
// }