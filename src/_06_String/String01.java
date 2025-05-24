package _06_String;

public class String01 {
    public static void main(String[] args) {
// 다 대소문자 관련 o
        String str = "My name";
        System.out.println(str.length());  // 문자열 길이
        System.out.println(str.toUpperCase()); // 전부 대문자로
        System.out.println(str.toLowerCase()); // 전부 소문자로
        System.out.println(str.contains("name")); // 포함여부 , 결과는 boolean
        System.out.println(str.indexOf("name")); //해당위치정보 (0부터시작, 띄어쓰기도 포함) / 없는 딘어쓰면 -1 반환

        str = "I like music and movie and travel";
        System.out.println(str.lastIndexOf("and")); // 여러개중에서 마지막 위치 -> 23 / 없는 단어쓰면 -1 반환
        System.out.println(str.startsWith("I like")); // 해당 문자열로 시작하냐? / boolean 출력
        System.out.println(str.endsWith("travel")); // 해당 문자열로 끝나냐?  / boolean 출력
        //System.out.println(str.replace("바꿀대상", "뭘로 바꿀지")); // 특정 문자열을 다른 문자열로 대체
        System.out.println(str.replace("I","You"));
        System.out.println(str.substring(7,12)); // 인덱스 기준 7 ~ 11, 끝지점은 본인 포함 x
        System.out.println(str.substring(str.indexOf("movie"),str.indexOf("."))); // movie ~ .까지 출력해라

        str = "    I like you    ";
        System.out.println((str.trim())); //시작과 끝 공백제거 (중간 공백 제거 x)

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); // 뒤에 거랑 붙어서 나옴 (s2가 아니어도 () 안에 내용이랑 붙여주는 거임)

        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat("23").concat(s2));

//문제
        String Id = "030902-1234567";
        //출력을 1까지만 해라.

        System.out.println(Id.substring(0,8));
        System.out.println(Id.substring(0,Id.indexOf("-")+2));



    }
}
