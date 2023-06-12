import java.util.ArrayList;

/**
 * MainClass
 */



public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Ryzhik", 10);
        Cat cat3 = new Cat("Snezhok", 8);
        Cat cat4 = new Cat("Pushok", 7);
        Cat cat5 = new Cat("Chernysh", 12);
        Cat cat6 = new Cat("Cat", 5);

        ArrayList<Cat> Cats = new ArrayList<>();
        Cats.add(cat1);
        Cats.add(cat2);
        Cats.add(cat3);
        Cats.add(cat4);
        Cats.add(cat5);
        Cats.add(cat6);

        Plate plate = new Plate(20);

        plate.info();
    
        for (Cat cat : Cats) {

            if (cat.getSatiety() == false) {

                if (cat.getAppetite() <= plate.getFood()) {
                    plate.setFood(cat.eat(plate.getFood()));                  
                }
                cat.info();
                plate.info();
            }
        }
        plate.addition();
        plate.info();

        for (Cat ccat : Cats) {

            if (ccat.getSatiety() == false) {

                if (ccat.getAppetite() <= plate.getFood()) {
                    plate.setFood(ccat.eat(plate.getFood()));                  
                }
                ccat.info();
                plate.info();
            }

        }
    }
}    
