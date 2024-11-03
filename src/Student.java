public class Student extends Person{

    private String dega;

    public void setDega(String dega){
        this.dega = dega;
    }

    @Override
    public void shfaqProfesionin() {
        System.out.println("Profesioni: Student");
    }
    public void shfaqDegen(){
        System.out.println("Dega:" + dega);
    }
}
