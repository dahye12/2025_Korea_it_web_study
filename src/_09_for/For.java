package _09_for;

public class For {
    public static void main(String[] args) {
        //for (초기화 ; 조건문 ; 증가 ;)

// 1-10까지 출력, 짝수만 출력!!!

        int i = 0;
        for(i =1; i<=10; i++){
            if(i%2==0){
                System.out.println(i);


            }
        }
// 1-100까지 더한 값을 출력하시오
        int j = 0;
        int sum = 0;
        for(i = 1; i<=100; i ++ ){
            sum += i;
        }
        System.out.println(sum);

    }
}
