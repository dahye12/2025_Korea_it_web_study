package _14_Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 -> 같은 자료형의 데이터를 여러 개 저장하는 연속된 공간
        //고정된 크기

        String country1 = "미국";
        String country2 = "헝가리";
        String country3 = "체코";
        String country4 = "중국";
        String country5 = "일본";

        //배열 선언 방법1
//        String[] countries = new String[5];

        //배열 선언 방법2
      //  String countries[] = new String[5];

        //배열 선언 방법3
//        String[] countries = new String[] { country1, country2, country3, country4, country5 };

        //배열 선언 방법 4
        String[] countries =  { country1, country2, country3, country4, country5 };


        //배열에서 수정
        countries[1] = "스위스";
        System.out.println(countries[1]);

        boolean[] bool = { true, false, true }; //도 가능
    }
}
