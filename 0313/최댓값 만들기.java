import java.util.Arrays;  
//Array기능을 임포트한다
class Solution {
    public int solution(int[] numbers) {
				//1.answer를 초기화한다.
        int answer = 0;
				//2.배열의 최대,최소값을 찾기위해 오름차순한다.
        Arrays.sort(numbers);
				//3.answer는 두 수의 최댓값을 찾기위해 배열에서 큰 수 끼리 곱한 수이다.                                           
        answer=numbers[numbers.length]*numbers[numbers.length-1];    
        return answer;
    }
}