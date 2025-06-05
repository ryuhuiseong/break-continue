public class Main {
    public static void printStudent(String name, int age, String sex) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + sex);
        System.out.println("------");

    }
    public static void main(String[] args) {
        System.out.println("=== 학생 정보 ===");
        Main.printStudent("alice", 20,"woman");
        printStudent("bob", 22, "man");
        printStudent("charlie", 25,"man");
    }
}