def solution(str1, str2):
    answer = 0
    if str2 in str1:   #str1안에 str2가 있다면
        answer = 1     #answer는 1이다.
    else : answer = 2   #아니면 answer는 2이다.
    return answer     #answer를 리턴한다.