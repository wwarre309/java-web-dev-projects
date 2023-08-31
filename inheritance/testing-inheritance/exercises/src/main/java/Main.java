public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield");
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat plainCat = new Cat();
        HouseCat cheshireCat = new HouseCat("Cheshire");

        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

    }
}
