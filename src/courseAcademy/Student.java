package courseAcademy;

public class Student implements Observer{
    String name;


    public Student(String name){
        this.name = name;
    }

    @Override
    public void listen(String s) {
        System.out.println(this.name+": "+s);
    }
}
