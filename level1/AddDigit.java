
import java.util.*;

public class AddDigit {
    public int solution(int n) {


        int answer = 0;
        while(n >= 1){

            answer += n%10;
            n /= 10;
        }
        System.out.println("Hello Java");

        return answer;
    }
}