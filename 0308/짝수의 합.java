class Solution {
    public int solution(int n) {  //n 파라미터를 이용한 solution함수
				//1. answer 변수를 초기화해준다
        int answer = 0;
				//2. i를 n만큼해서 배열의 길이를 만들고 +2를 해주는 포문을 만든다.
        for(int i = 2; i<=n; i+=2){ // 2부터 n이하의 짝수의 합
            answer +=i;  //answer = answer + i
        }
        return answer;  //answer를 반환
    }
}