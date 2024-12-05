package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void increaseWeight() {
        this.weight += 1;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", height: " + height + ", weight: " + weight;
    }
}
