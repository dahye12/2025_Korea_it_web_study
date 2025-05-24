package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {


        //형변환 , 정수에서 실수로 !!!
        int scoreInt = 98;
        System.out.println(scoreInt); // ->98
        System.out.println((float)scoreInt); // -> 98.0

        //실수에서 정수
        float scoreFloat = 98.5f;
        System.out.println(scoreFloat); //->98.5
        System.out.println((int)scoreFloat); //98

        // 자동 형변환
        double sum1 = 98.5+8; // 8앞에 double이 자동으로 붙음 double > int
        // double sum1 = 98.5+(double)8;

        // int sum2 = 8 + 55.3F; -> 오류남
        int sum2 = 8 + (int)55.3F;

        double 바쿠고 = 8.0;
        int convertedScoreInt = (int)바쿠고;
        // int < long < float < double (수동형변환) 순으로 크기가 크거든

        int 미도리야 = 8;
        double 바쿠고2 = 미도리야; //얘는 (int)안 붙여도 오류 안 나 !!!
        // double > float > long > int (자동형변환)


      // 뭐든지간에 문자열로 형변환 할 수 있는 2가지 방법
      // 정수 -> 문자열
      String str = String.valueOf(55); // 1. String.valueOf();


      String str2 = Integer.toString(55);  // 2. Integer.toSring(); // 암기법 : 인투더쓰릴 ㅋㅋ 인투더 스브 ㅋㅋ

      // 실수(double) -> 문자열
      String str3 = String.valueOf(55.0);
      str3 = Double.toString(55.0);

      // 실수(float) -> 문자열
      String str4 = String.valueOf(55.0f);
      str4 = Float.toString(55.0f);


      // 문자열 -> 숫자
        // 정수
        int num = Integer.parseInt("123"); // parse : 분석하다, 해석하다 // 정수를 문자열로 파싱했다고 한대

        // 실수
        Float num2 = Float.parseFloat("123f");









         }
}










