package 문자찾기;
import java.util.*;

// toCharArray : 문자열을 배열로 바꿔준다.
// toUpperCase : 문자열을 대문자로 바꿔준다.
// Character.toUpperCase : 문자를 대문자로 바꿔준다.

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        input1 = input1.toUpperCase();
        input2 = Character.toUpperCase(input2);

        int number = input1.length();
        int answer = 0;
        for (int i = 0; i < number; i++ ) {
            if (input1.charAt(i) == input2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}