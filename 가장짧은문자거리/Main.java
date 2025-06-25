package 가장짧은문자거리;
import java.util.Scanner;

// Math.min() 이용하기
// 좌우로 for문 2번 사용해서 e로부터 얻을 수 있는 가장 작은값을 구한다.

// ------------------------------------> 이 방향으로 한번. e가 왼쪽에 있을 때 기준으로 떨어진 거리 => 1001 1 2 3 0 1 2 3 4 0
// teachermode
// <------------------------------------ 이 방향으로 한번. e가 오른쪽에 있을 때 기준으로 떨어진 거리 + 최소값 비교 => 1 0 1 2 1 0 1 2 2 1 0 

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s = in.next();
    char c = in.next().charAt(0);

    int [] arr = new int[s.length()];

    int num = 1000;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) num = 0;
        if (s.charAt(i) != c) num++;
        arr[i] = num;
    }

    num = 1000;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == c) num = 0;
        if (s.charAt(i) != c) num++;

        arr[i] = Math.min(arr[i], num);
    }

    
    for (int i = 0; i < s.length(); i++) {
        System.out.print(arr[i] + " ");
    }
  }
}
