def solution(n): 
		#제곱수가 무엇이지 찾아보다가 is_integer()함수를 알게 되었다.
		#is_integer(n)이면 n이 제곱수인지 확인해준다.  
    if (n**(0.5)).is_integer():
				#n**0.5 = 루트n
        return 1 #n이 제곱수이면 1
    else:
        return 2 #n이 제곱수가 아니면 2