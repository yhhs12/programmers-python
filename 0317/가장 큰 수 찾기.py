def most_number(array):
    answer = [0,0]
    #인덱스 : 배열값에 위치한 번호값
    answer[0] = max(array)
    #배열 첫번째는 최대값을 넣는다
    answer[1] = array.index(max(array))
    #배열 두번째에는 그 최댓값에 위치를 넣는다.
    return answer