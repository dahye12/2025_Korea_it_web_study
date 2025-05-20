package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {


        //변수
        //자료형 변수명 = 데이터;


        // 정수 - int, long

        int num = 123; //선언과 동시에 초기화
        int num1; //선언
        num1 = 123; //초기화

        long l = 1000_000_000L; //언더바 넣어서 가독성 up

        // 실수 - float,double
        float f = 3.14F;
        double d = 3.14;

        // 문자 - char
        char a = 'a';
        char b = 'b';

        System.out.println(a+b); //195 -> 문자를 더하면 숫자 출력 (아스키코드로 더해짐 ㅇㅇ)
        System.out.println(" " + a+b); //ab -> " " 빈문자열을 붙이면 그 전체를 문자열로 생각함

        // 문자열 - string
        String str = "안녕하세요";

        // 논리자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        // <<<문제>>> 제 이름은 박다혜입니다. 제 나이는 23이고, 취미는 요리하기 입니다.

        String name = "박다혜", hobby = "요리하기";
        int age = 23;
        System.out.println("제 나이는" + name + "입니다." + "제 나이는 " + age +"이고 " + "취미는 " + hobby + "입니다.");
    }
}

