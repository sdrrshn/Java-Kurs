public class InstructorManager extends UserManager {
    User user;

    public InstructorManager(User user) {
        this.user = user;
    }

    public void coursesadd(Instuctor instuctor) {

        System.out.println(instuctor.firsName + "hoca " + instuctor.course + " İsimli kursu ekledi");


    }

}
