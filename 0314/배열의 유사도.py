def solution(s1, s2):
    answer = 0
    for i in s1: 
			#s1배열에서 하나씩 i를 꺼낸다
        if i in s2:
			#위에서 꺼낸 i가 s2에도 있으면
            answer += 1
			//answer값을 1 증가시킨다
    return answer