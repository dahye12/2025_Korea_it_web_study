package _13_breakContinue;

public class while_continue {
    public static void main(String[] args) {


        int wait = 50; //대기인원수
        int nowNum = 1; // 현재 입장 번호 (시작번호)
        int max = 10;  //판매가능수
        int sold = 0;  //현재 판매량
        int noShow = 3; //노쇼 번호

        while (nowNum <= wait) {
            System.out.println(nowNum + "번 손님 입장");

            if(nowNum == noShow) {
                System.out.println(nowNum + "번 손님 노쇼함 ㅜㅜ");
                nowNum++;
                continue;

            }
            sold++; //판매처리
            if(sold == max){ //메뉴가 다 팔렸을 때
                System.out.println("재료소진");
                break;
            }
            nowNum++;
        }

    }
}
