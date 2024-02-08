

public abstract class Animal {
    private double weight;
    private Integer age;
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(double weight, Integer age, String name, String color) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk(){
        System.out.println(name + " идет по земле!");
    }
}
