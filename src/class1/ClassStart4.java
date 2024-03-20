package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 15;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1; //인스턴스 복사가 아닌 안의 값(여기선 참조값) 만 복사해서 대입한다
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이:" + students[1].age + " 성적:" + students[2].grade);
        System.out.println("이름: " + students[0].name + " 나이:" + students[1].age + " 성적:" + students[2].grade);

    }
}
