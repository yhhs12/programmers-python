numberList = []
while True :
    try :
        number_input = int(input('정수를 입력하세요'))

        if number_input == 0 :
            if len(numberList) == 0:
                print("입력된 데이터가 하나도 없습니다.")
                continue
            
            print(f"입력된 데이터 수 : {len(numberList)}, 합계 : {sum(numberList)} \
              평균 : {sum(numberList) / len(numberList):.2f} " )
            break

        
        numberList.append(number_input)
        print(numberList)
        

    except ValueError: 
        print("정수값만 입력하세요!")
        continue
