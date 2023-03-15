class Solution {
    public int solution(int[] array, int n) {
				//1.answer를 0으로 초기화시킨다
        int answer = 0;
				//2.for문을 이용하여 0부터 배열에 자연수n이 있는지
			  //확인하는 작업이다.
        for(int i=0; i < array.length; i++){
						//3.i번째 array배열에 n이 있으면 answer값을 1증가시킨다
            if(array[i] == n){
                answer++;
            }
        }
				//4.answer를 리턴한다.
        return answer;      
    }
}
