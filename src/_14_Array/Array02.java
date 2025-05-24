package _14_Array;

public class Array02 {
    public static void main(String[] args) {

        //배열순회

        String country1 = "미국";
        String country2 = "헝가리";
        String country3 = "체코";
        String country4 = "중국";
        String country5 = "일본";

        String[] countries =  { country1, country2, country3, country4, country5 };

        for (int i = 0; i < 5; i++) {
            System.out.println(countries[i]);

        }

        for (int i = 0; i < countries.length ; i++) {
            System.out.println(countries[i]);

            // enhanced for (for-each) 향상된 for문
            for (String country : countries) {
                System.out.println(country);
            }

        }
    }
}
