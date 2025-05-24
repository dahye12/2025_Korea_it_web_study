package _06_String;

public class StringCompare {
    public static void main(String[] args) {


        String password1 = "1234";
        String password2 = "1234";
        System.out.println(password1 == password2); //true // 같은 문자열 리터럴이라 참조공간이 같아요
        System.out.println(password1.equals(password2)); //true


        //인스턴스 생성
        password1 = new String("1234");
        password2 = new String("1234");
        System.out.println(password1 == password2); //false  // ==: 참조위치가 같냐  //인스턴스 생성은 새로운 공간을 만든거라 1234공간이 달라요
        System.out.println(password1.equals(password2)); //true // .equals() : 내용이 같냐



    }
}
