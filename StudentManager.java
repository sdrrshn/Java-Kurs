public class StudentManager extends UserManager {
    User user;

    public StudentManager(User User) {
        this.user = user;
    }
    public void deleteCourse(Student student){
        System.out.println(student.firsName + " İsimli Öğrenci " + student.registeredCourse + " Kursunu sildi");
    }

}

