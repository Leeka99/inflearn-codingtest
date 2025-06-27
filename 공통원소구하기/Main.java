package 공통원소구하기;
import java.util.*;

// Two Pointer Algorithm 사용하기
// 정렬하고 시작하기 -> Arrays.sort()

public class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr1 = new int[a];
    for(int i = 0; i < a; i++) {
        arr1[i] = sc.nextInt();
    }

    int b = sc.nextInt();
    int[] arr2 = new int[b];
    for(int i = 0; i < b; i++) {
        arr2[i] = sc.nextInt();
    }

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int p1 = 0;
    int p2 = 0;
    ArrayList<Integer> answer = new ArrayList<>();
    while (p1 < a && p2 < b) {
        if (arr1[p1] == arr2[p2]) {
            answer.add(arr1[p1++]);
            p2++;
        }

        else if (arr1[p1] < arr2[p2]) p1++;

        else p2++;
    }

    for (int i : answer) {
        System.out.print(i + " ");
    }
  }
}