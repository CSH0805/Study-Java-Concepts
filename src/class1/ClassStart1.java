package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "벨로그";
        student1.age = 18;
        student1.grade = 90;

        Student[] students = new Student[1];
        students[0] = student1;

        System.out.println("이름은 " + students[0].name + "이고 나이는 " + students[0].age + "살이고 성적은 " +
                students[0].grade + "점 입니다.");
    }
}
