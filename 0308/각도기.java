class Solution {
    public int solution(int angle) { //angle 파라미터를 이용한 solution 함수
        if (angle > 0 && angle < 90) return 1; //0 < angle < 90 : 1을 반환
        else if (angle == 90) return 2; // angle이 90 이면 2를 반환
        else if (angle > 90 && angle < 180) return 3; // 90 < angle < 180 : 3 반환
        else return 4; //나머지는 4를 반환
    }
}