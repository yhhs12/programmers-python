import java.util.Arrays;  //Arrays 기능을 임포트해준다.


    public int solution(int[] sides) {
        Arrays.sort(sides);  //sides 배열의 원소를 오름차순한다.
        return sides[0] + sides[1] > sides[2] ? 1 : 2; 
						 // 제일 큰 원소와 나머지 원소의 합을 비교하여 삼항연산자로 나타낸다.
    }
}