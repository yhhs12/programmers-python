def solution(n, numlist):  #정수n과 정수배열numlist가 파라미터 일 때
    answer = []
    for i in numlist:   #numlist에서 i를 빼와서
        if i % n == 0:  #i와 n을 나누어서 나머지가 0이면
            answer.append(i)    #i를 answer배열에 추가한다.
    return answer