public class Dog extends Animal{

    public Dog() {
    }

    public Dog(double weight, Integer age, String name, String color) {
        super(weight, age, name, color);
    }

    public void muve(){
        System.out.println("наша " + super.getColor() + " собака по имени " + super.getName() + " бегает по лесу!");
    }
}
