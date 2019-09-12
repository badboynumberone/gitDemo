package day02;

public class Student {
    String name;
    int age;
    String sex;
    String classNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", classNum='" + classNum + '\'' +
                '}';
    }
}
