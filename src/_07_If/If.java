package _07_If;

public class If {
    public static void main(String[] args) {
        // if (조건) { 참이면 출력 }

        boolean isAdult = false;
        int height=130;

        if( height >=120 && isAdult) {
            System.out.println("참여 가능");
        }  // 이러면 아무것도 출력이 안됨. 둘 다 참이어야 되는 거 잖아!!!!


        if( height >=120 && !isAdult ) {
            System.out.println("참여 가능");
        }  // 이러면 가능해지는 거지 !!!
    }
}
