public class Main {

    public static void main(String[] args) {
        Instuctor ınstuctor = new Instuctor();
        ınstuctor.firsName = "Engin ";
        ınstuctor.lastName = "Demirog";
        ınstuctor.course = "Java";

        Student student = new Student();
        student.firsName = "Sidar";
        student.lastName = "Şahin";
        student.registeredCourse = "Java ";


        InstructorManager instructorManager = new InstructorManager(ınstuctor);
        instructorManager.coursesadd(ınstuctor);
        StudentManager studentManager = new StudentManager(student);
        studentManager.deleteCourse(student);


    }
}
