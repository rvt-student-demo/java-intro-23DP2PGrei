package lv.rvt;

public class HealthStation {

    private int count;

    public HealthStation() {
        this.count = 0;
    }

    public double weigh(Person person) {
        count++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.increaseWeight();
    }

    public int weighings() {
        return count;
    }
}
