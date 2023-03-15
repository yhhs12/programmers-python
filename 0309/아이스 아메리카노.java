class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]  //answer라는 int배열 2개를 만든다                            ];
        answer[0] = money / 5500;  //배열 첫번째는 5500원으로 나워 몇 잔 마셨는지 확인
        answer[1] = money % 5500;  //배열 두번째는 5500원으로 나눈 나머지를 확인
        return answer;
    }
}