package 두배열합치기;

import java.util.*;

// Two pointers 알고리즘 사용하자.
// 답을 구할 수 있느냐가 아닌 효율적으로 짤 수 있는지를 물어보는것이다.

public class Main {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];

    for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
    }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

    for (int i = 0; i < m; i++) {
        arr2[i] = sc.nextInt();
    }
    sc.close();

    int p1 = 0;
    int p2 = 0;
    ArrayList<Integer> answer = new ArrayList<>();
    while (p1 < n && p2 < m) {
        if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
        else answer.add(arr2[p2++]);
    }

    while (p1 < n) {
        answer.add(arr1[p1++]);
    }

    while (p2 < m) {
        answer.add(arr2[p2++]);
    }

    for(int i : answer) {
        System.out.print(i + " ");
    }
  }
}
