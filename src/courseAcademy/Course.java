package courseAcademy;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    String name;
    String availability;

    List<Observer> observers;

    public Course(String name){
        this.name = name;
        observers = new ArrayList<>();
     }


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        for (Observer observer: observers){
            observer.listen(availability);
        }
    }

    public void updateAvailability(boolean available){
        availability = "The "+this.name +" course is "+ (available ? "available now" : "not available now");
        sendNotification();
    }
}
