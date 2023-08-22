package workshop.time.Stats;

import p04_oop.interfaces.stringExample.StringTester;

import java.util.Objects;

public class Statistic {

    private final String name;
    private final Double value;

    public Statistic(String name, Double value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public Double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistic statistic = (Statistic) o;
        return Objects.equals(name, statistic.name) &&
                Objects.equals(value, statistic.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
