def divisor(n):
    answer = 0
    n = int(n)
    div = []
    
    for i in range(1, n+1):
        if n % i == 0:
            div.append(i)
            
    return len(div)