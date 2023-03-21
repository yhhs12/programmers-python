def solution(my_string):
    answer = []
    string = my_string.lower()
    for i in string:
        answer.append(i)
    answer.sort()
    return ''.join(answer)