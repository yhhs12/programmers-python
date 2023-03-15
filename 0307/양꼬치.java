class Solution {
    public int solution(int n, int k) { // n과 k의 파라미터로 이루어진 함수
        int price = 0; //가격을 선언과 동시에 초기화시킨다.        
        if(n >= 10) { //10인분 이상 -> 음료수 하나 무료 제공한다.
            price = 12000*n + 2000*(k-(n/10));  
					// 양꼬치 n인분과 n/10만큼의 음료수 빼야 마신 음료 갯수가 나온다.                
					  return price;  //n >= 10이면 위의 price를 리턴해준다.
        }else {            
            price = 12000*n + 2000*k; //무료 음료수 없음
            return price; //n >= 10이면 위의 price를 리턴해준다.
        }
     
        
    }
}