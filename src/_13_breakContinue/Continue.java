package _13_breakContinue;

public class Continue {
    public static void main(String[] args) {

        //반복문 - continue
        // continue - 다시 처음으로 돌아감


        int wait = 50; //대기인원수
        int max = 10;  //판매가능수
        int sold = 0;  //현재 판매량
        int noShow = 12; //노쇼 번호

        for(int i = 1; i <= wait; i++){
            System.out.println(i + "번째 손님 입장");
            if(i == noShow){
                System.out.println(i +"번 손님 노쇼 ㅜㅜ");
                continue;
            }
            sold++;
            if(sold == max) {
                System.out.println("재료소진");
                break;
            }
        }
    }
}
