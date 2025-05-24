package _05_Operator;

public class Operator {
    public static void main(String[] args) {

        int num1 =1;
        int num2=2;

        // 연산자

        // 대입연산자
        int num = 10; // 같다 x , 오른쪽에서 왼쪽으로 대입 !!!

        // 산술연산자
        System.out.println(num1 + num2);

        // 복합 대입 연산자
        num +=4;
        num %=2; // num = num % 2

        // 증감 연산자
        int j = 10;
        System.out.println(j ++);

//문제
        int a = 5;
        int b = a++ + ++a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 비교연산자 -> 결과가 항상 boolean 참/거짓 중에 하나
        num1 =5;
        num2 =5;
        System.out.println(num1 > num2);


        //논리연산자  (&, |, !)
        // & : 둘 다 true여야 함. (논리곱, and)
        // | : 둘 중에 하나라도 true면 true임. (논리합, or)
        // ! : 반대라는 뜻

        //논리 연산자로 합 (&&, ||)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 && flag2);


        // 삼항 연산자 ( (조건) ? 참  : 거짓   )
        int x = 5;
        int y = 3;

        int max = ((x > y) ? x : y);


    }
}
