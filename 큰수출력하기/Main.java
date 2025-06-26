package 큰수출력하기;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number = in.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(in.nextInt());

    int lastNum = arr.get(0);
    for (int i = 1; i < number; i++) {
      int currNum = in.nextInt();
      if (lastNum < currNum) arr.add(currNum);
      lastNum = currNum;
    }

    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + " ");
    }
  }
}