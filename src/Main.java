public class Main {
    public static void main(String[] args) {
        int score = 60;

        String result;

        if (score > 59) {
            result = "합격";
        }else {
            result = "불합격";
        }
        System.out.println("결과 : " + result);
    }
}