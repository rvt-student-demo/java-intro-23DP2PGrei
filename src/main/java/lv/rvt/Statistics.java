package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average;

    public Statistics(int count, int sum, double avarage) {
        this.count = count;
        this.sum = sum;
        this.average = avarage;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
        average = (double)sum / count;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return average;
    }
}
