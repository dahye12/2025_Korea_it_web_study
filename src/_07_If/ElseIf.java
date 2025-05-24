package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        // 다중조건문

        /*
        90이상이면 a
        80이상이면 b
        70이상이면 c
        나머지는 d
         */

        int score = 100;

        if(score>=90){
            System.out.println('a');
        }
        else if(score>=80){
            System.out.println('b');
        }
        else if(score>=70){
            System.out.println('c');
        }
        else{
            System.out.println('d');
        }

        // 중첩 if문
        String gender = "남성";
        int age = 20;

        if(age >=20){
            if(gender.equals( "남성")){  //문자열비교할 때는 꼭 .equals를 사용해 !! ==은 참조주소가 같은지 묻는거니까 ~!
                System.out.println("성인남성.");
            }
            else{
                System.out.println("성인여성.");
            }
        }
        else{
            System.out.println("미성년자");
        }
    }
}
