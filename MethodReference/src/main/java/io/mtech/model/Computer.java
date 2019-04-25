package io.mtech.model;

public class Computer {
	private Integer age;
    private String color;
    private Integer healty;

    Computer(final int age, final String color) {
        this.age = age;
        this.color = color;
    }

    Computer(final Integer age, final String color, final Integer healty) {
        this.age = age;
        this.color = color;
        this.healty = healty;
    }

    public Computer() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    Integer getHealty() {
        return healty;
    }

    void setHealty(final Integer healty) {
        this.healty = healty;
    }

    public void turnOnPc() {
        System.out.println("Computer turned on");
    }

    public void turnOffPc() {
        System.out.println("Computer turned off");
    }

    public Double calculateValue(Double initialValue) {
        return initialValue / 1.50;
    }
    @Override
    public String toString() {
        return "Computer{" + "age=" + age + ", color='" + color + '\'' + ", healty=" + healty + '}';
    }
}
