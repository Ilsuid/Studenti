public class App {
    public static void main(String[]args){

        Student student = new Student();
        student.setDega("Teknologji Informacioni");

        student.shfaqEmrin("Ilsuid");
        student.shfaqMoshen(22);
        student.shfaqProfesionin();
        student.shfaqDegen();

        Person person = new Person();
        person.shfaqEmrin("Zzz");
        person.shfaqMoshen(21);
        person.shfaqProfesionin();
    }
}
