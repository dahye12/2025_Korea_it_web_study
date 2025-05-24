package _10_While;

public class While {
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 참일 경우 계속 반복
        // while(조건) {
        //    반복할 코드
        // }


        // for문 - 횟수 중심
        // while문 - 조건 중심

        //1-5 출력
        int i = 1 ;
        while(i <=5) {
            System.out.println(i);
            i++; // 무한루프에 빠지기 때문에 조건 필수
        }
        //10에서 거꾸로 10까지
        int j = 10;
        while(j >= 1) {
            System.out.println(j);
            j--;
        }
        // 짝수만 출력 (1-10)
        int k = 1;
        while(k <= 10){
            if(k % 2 == 0){
                System.out.println(k);
            }
        }
    }
}
