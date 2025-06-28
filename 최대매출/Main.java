package 최대매출;
import java.util.Scanner;

// 아래 내가 생각한 구현으로는    결과 :  Time Limit Exceeded 나옴...
// i가 1씩 증가하면서 모두 확인하지 말자. -> 복잡도 높아짐

// Sliding Window 사용하기 : 길이가 n인 창(배열)을 만들어서 그대로 밀고 가기
// 방법) 연속된 3개의 합을 계속 구해야할 때,
// 첫번째 : i + (i + 1) + (i + 2) = sum
// 두번째 : sum - i + (i + 3) = sum
// 세번째 : sum - (i + 1) + (i + 4) = sum
// ...
// 이런식으로 (기존 합 - 지나간 값 + 현재 포함된 값) 형식으로 구하자.

// 슬라이딩 윈도우 적용한 정답
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for (int i= 0; i < n; i++) {
        arr[i] = in.nextInt();
    }

    int answer = 0;
    int sum = 0;
    for (int i = 0; i < k; i++) sum += arr[i];
    answer = sum;

    for (int i = k; i < n; i++) {
        sum += (arr[i] - arr[i - k]);
        answer = Math.max(answer, sum);
    }

    System.out.println(answer);
    }
}

// 첫번째 나의 생각
// public class Main {
//   public static void main(String[] args){
//     Scanner in=new Scanner(System.in);
//     int n = in.nextInt();
//     int k = in.nextInt();
//     int[] arr = new int[n];
//     for (int i= 0; i < n; i++) {
//         arr[i] = in.nextInt();
//     }

// int t = 0;
// int answer = 0;
//     while (t + k <= n) {
//         int tmp = 0;
//         for (int i = 0; i < k; i++) {
//             tmp += arr[t + i];
//         }
//         answer = Math.max(answer, tmp);
//         t++;
//     }

//     System.out.println(answer);
//   }
// }


