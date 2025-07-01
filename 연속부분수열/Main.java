package 연속부분수열;
import java.util.Scanner;

// Two Pointer 사용해서 해결하기
// for , while을 상황에 맞게 잘 활용하자.
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];

    for (int i =0; i < n; i++) {
        arr[i] = in.nextInt();
    }

    int answer = 0;
    int st = 0;
    int sum = 0;

    for (int et = 0; et < n; et++) {
      sum += arr[et];
      if (sum == m) answer++;
      while (sum >= m) {
        sum -= arr[st++];
        if (sum == m) answer++;
      }
    }

    System.out.println(answer);

  }
}

// 기존에 풀려고 했던 코드 
// 논리상 실수가 있었다.
// 1. sum의 초기값을 sum = arr[st] 로 잡아서 처음부터 인덱스 0번 값을 확인하지 않고 넘어감
// 2. sum > m 이면 1번만 빼줌. 만약 수가 많이 커진다면 st를 여러번 빼는 것을 반복한 뒤 m보다 작아졌을 때 et를 증가시켜줘야 한다.
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args){
//     Scanner in=new Scanner(System.in);
//     int n = in.nextInt();
//     int m = in.nextInt();
//     int[] arr = new int[n];

//     for (int i =0; i < n; i++) {
//         arr[i] = in.nextInt();
//     }

//     int answer = 0;
//     int st = 0;
//     int et = 0;
//     int sum = arr[st];

//     while (et < n - 1) {
//       sum += arr[++et];

//       if (sum > m){
//         sum -= arr[st++];
//       }

//       if (sum == m) {
//         answer++;
//       }

//     }

//     System.out.println(answer);

//   }
// }
