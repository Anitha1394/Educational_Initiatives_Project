package behavioral.observer.src;

import java.util.Objects;

public class UserDisplay implements Observer {
    private final String name;

    public UserDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println("[" + name + "] received temperature update: " + temperature + "°C");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDisplay)) return false;
        UserDisplay that = (UserDisplay) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}