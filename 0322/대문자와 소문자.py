def solution(my_string):
    answer = []
    for i in my_string:
        if i.islower():
            answer.append(i.upper())
        else:
            answer.append(i.lower())
    return ''.join(answer)