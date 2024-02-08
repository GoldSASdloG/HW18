public class Duck extends Animal {

    public Duck() {
    }

    public Duck(double weight, Integer age, String name, String color) {
        super(weight, age, name, color);
    }

    public void muve(){
        System.out.println("наша " + super.getColor() + " уточка по имени " + super.getName() + " летает по воздуху");
    }
}
