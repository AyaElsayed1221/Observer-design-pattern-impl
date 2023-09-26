package courseAcademy;

public class Executer {
    public static void main(String[] args) {

         Student Ahmed = new Student("Ahmed");
         Student Mohammed = new Student("Mohammed");
         Student Blal = new Student("Blal");

         Course Java = new Course("Java");

         Java.subscribe(Ahmed);
        Java.subscribe(Mohammed);
        Java.subscribe(Blal);

        Java.updateAvailability(true);

        Java.unsubscribe(Mohammed);

        Java.updateAvailability(false);
    }
}
