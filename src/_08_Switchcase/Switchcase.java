package _08_Switchcase;

public class Switchcase {
    public static void main(String[] args) {
//case는 나뉘는 값이 명확한 경우 쓰인다. //if는 범위다.

        //1등 - 100마넌
        //2,3등 - 50마넌
        //4등 - 20마넌
        //그 외 - 아쉽네요

//        int ranking= 1;
//
//        switch(ranking){
//            case 1 :
//                System.out.println("100마넌");
//                break;
//            case 2 :
//            case 3 :
//                System.out.println("50마넌");
//                break;
//            case 4 :
//                System.out.println("20마넌");
//                break;
//            default :
//                System.out.println("아쉽네용ㅋ");
//       }

        // 1등급이면 10000, 낮아질수록 -1000
        int grade = 3;
        int price = 7000;
        // 자, grade가 정해져있으니까 이게 switch문에 들어가야겟지. 바뀌는 건 switch니까 이걸 if에 넣어.
        switch (grade) {
            case 1 :
                price += 3000;
                break;
            case 2 :
               price += 2000;
               break;
            case 3 :
                price += 1000;
                break;
            default :
        }
        System.out.println("가격은 " + price);
    }
}
