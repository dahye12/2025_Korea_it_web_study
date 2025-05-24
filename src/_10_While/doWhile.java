package _10_While;

public class doWhile {
    public static void main(String[] args) {
        // 반복문 - do while

        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 1번 실행
        // do {
        // 반복될 코드
        // } while(조건);

//1-5까지 출력해라
        int i = 10;
        do {
            System.out.println(i);
            i++;

        } while(i<=5); //  10출력됨 while에서는 돌 일이 x
    }
}