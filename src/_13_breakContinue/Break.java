package _13_breakContinue;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break, continue
        // break - 특정상황(조건)에서 반복문을 빠져나옴

        // 톤쇼우 웨이팅 50명
        //판매 가능한 갯수 10개
    //for문 break
        int wait = 50;
        int max = 10;
        for (int i = 1; i <= wait; i++) { //가게가 운영 중 (노쇼가 생길 수 있으니 50명을 다 받자)
            System.out.println(i + "번 손님 입장");

            if (i == max) {
                System.out.println("재료소진");
                break;
            }

        } System.out.println("영업종료");
    // while문 break
        int nowNum = 1;
        while (nowNum <= wait) {
            System.out.println(nowNum + " 번 손님 입장");

            if (nowNum == max) {
                System.out.println("재료소진");
                break;
            }
            nowNum++;
        }
        System.out.println("영업종료");

    }
}
