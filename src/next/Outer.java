package next;
import model.Student;

public class Outer {
    public static void main( String[]  args) {
        Student student = new Student();
        student.setName("崔狗");
        student.setSex("男");
        student.setAge(18);
        student.setNumber("123");
        System.out.println("名字："+student.getName()+" 年龄："+student.getAge()+" 性别："+student.getSex()+" 学号："+student.getNumber());
    }
}

