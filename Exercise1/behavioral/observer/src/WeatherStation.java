package behavioral.observer.src;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
            System.out.println("Observer registered: " + o);
        } else {
            System.out.println("Observer already registered: " + o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.remove(o)) {
            System.out.println("Observer removed: " + o);
        } else {
            System.out.println("Observer not found: " + o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("\nWeatherStation: Temperature changed to " + temperature + "°C");
        notifyObservers();
    }
}