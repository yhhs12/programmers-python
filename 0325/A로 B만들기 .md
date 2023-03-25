//파라미터 2개가 순서를 바꿔서 같은 형태가 되는지에 관한 문제이다.
def solution(before, after):
answer = 0
cnt = 0
for i in before: //before 문자열의 원소를 하나씩 i로 꺼내어
if before.count(str(i)) == after.count(str(i)):
//before에서 가져온 i갸 문자열i가 before 있는 수와 after에 있는 수와 같으면
cnt +=1 //cnt를 1씩 증가 시킨다.
if cnt == len(before): //증가시켜서 cnt가 before의 길이와 같다면
answer =1 //answer는 1이 된다.
answser = 0 //아니면 answer는 0이다.
return answer /answer를 리턴한다.
