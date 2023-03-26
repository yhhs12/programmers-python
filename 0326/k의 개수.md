//정수 i , j , k 파라미터가 주어질 때 i부터 j까지 수 중에서 k가 몇번 등장하는지
def solution(i, j, k):  
 answer = 0  
 for a in range(i , j+1): //i부터 j까지 원소를 하나씩 꺼낼 때
for t in str(a): //문자열화한 a를 하나씩 꺼낼 때
if t == str(k): // 꺼낸 t가 문자열k와 같으면
answer += 1 //answer에 1을 추가한다.

    return answer
