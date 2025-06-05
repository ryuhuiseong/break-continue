public class Main {
    public static void main(String[] args) {
        char asciichair = ' ';
        System.out.println("Character: " + asciichair);

        int asciiCode = (int) asciichair;
        System.out.println("ASCII Code: " + asciiCode );

        char koreanchar = '가';
        System.out.println("Character: " + koreanchar);

        int unicodeCode = (int) koreanchar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCode).toUpperCase());
    }
}