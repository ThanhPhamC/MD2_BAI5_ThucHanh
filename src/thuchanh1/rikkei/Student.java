package thuchanh1.rikkei;

public class Student {
    private int rolloNo;
    private String name;
    private static String college = "BBDIT";

    public Student(int r, String n) {
        rolloNo = r;
        name = n;
    }

    static void change() {
        college = "RIKKEI ACADEMY";
    }

    void display() {
        System.out.println(rolloNo + " " + name + " " + college);
    }
}
