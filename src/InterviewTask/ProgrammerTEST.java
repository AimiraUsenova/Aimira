package InterviewTask;

public class ProgrammerTEST {

    public static void main(String[] args) {

        ProgrammerTeacher teacher=new ProgrammerTeacher();
        teacher.addLanguages("Java");

        Programmer programmer=new Programmer();
        System.out.println(teacher.teach(programmer,"Java"));



    }
}
