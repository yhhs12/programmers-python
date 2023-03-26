def solution(i, j, k):
    answer = 0
    for a in range(i , j+1):
        for t in str(a):
            if t == str(k):
                answer += 1
            
    return answer