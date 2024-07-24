package enumeration.test.ex1;


public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            printGrade(value);
        }
    }

    private static void printGrade(AuthGrade grade) {
        System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
    }
}
