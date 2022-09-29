package thuchanh1.rikkei;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student st1 = new Student(12, "thanh");
        Student st2 = new Student(13, "pc");
        Student st3 = new Student(14, "thanh pc");
        st1.display();
        st2.display();
        st3.display();
    }
}