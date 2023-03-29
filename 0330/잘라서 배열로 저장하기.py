def solution(my_str, n):
    answer = []
    for _ in range(1, len(my_str)+1, n):
        answer.append(my_str[:n])
        my_str = my_str[n:]
    return answer