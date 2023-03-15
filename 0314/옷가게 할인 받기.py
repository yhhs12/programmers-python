def solution(price): 
		# 문제는 ?만원 이상이지만 정확히 구간을 나눠주어야 한다
    if price >= 500000:
        return int(price*0.8)
    elif price >= 300000 and price < 500000:
				#30만원이상 50만원 미만
        return int(price * 0.9)
    elif price >= 100000 and price < 300000:
				#10만원이상 30만원 미만
        return int(price * 0.95)
    else:
				#나머지는 price 그대로
        return int(price)