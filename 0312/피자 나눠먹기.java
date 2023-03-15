class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n%7 != 0? (n/7) + 1 : n/7;  
						// n을 7로 나눈 나머지가 0이 아니면 나눈 값의 정수부분에 1을 더하고 
						// 나머지가 0이면 n을 7로 나눈 값
        return answer;        
    }
}