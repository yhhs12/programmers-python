second_input = int(input("정수를 입력하시오"))

hours = second_input // 3600
second_input %= 3600

minutes = second_input // 60
second_input %= 60 

print(f"{hours}시간 {minutes}분 {second_input}초")
