def dirty(n, t):    
    for i in range(t):  #시간마다 2배씩 증가하므로 for문을 사용하였다
        n = n * 2
    return n