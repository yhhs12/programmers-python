class Solution {
    public double solution(int[] numbers) { //numbers라는 파라미터를 solution에 대입한다
        double answer = 0; //answer를 선언과 동시에 초기화한다.
        int sum = 0; //sum을 선언과 동시에 초기화한다.
        for(int i = 0; i < numbers.length; i++){ //for문을 이용하여
            sum += numbers[i]; //배열의 원소의 합들을 구한다.
        }
        answer = (double)sum / numbers.length; 
				`//위에 구한 합과 배열의 길이를 나누어 평균값을 구한다.
        return answer; //answer로 리턴한다.
    }
}