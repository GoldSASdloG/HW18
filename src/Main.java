public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.

        Dog bari = new Dog(14, 4, "Бари", "черная");
        bari.walk();
        bari.muve();


        Duck kryka = new Duck(2, 3, "Кряка", "белая");
        kryka.walk();
        kryka.muve();
    }
}
