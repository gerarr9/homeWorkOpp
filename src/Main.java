import Animal.Mammal.Herbivore;
import Animal.Mammal.Predator;
import Animal.amphibians;

public class Main {
    public static void main(String[] args) {

        Train lastochka = new Train("Ласточка","B-901",2011,"Россия","",301,3500,
                0,"Белорусский вокзал","Минск-Пассажирский",11,0);
        lastochka.print();
        Train leningrad = new Train("Ленинград","D-125",2019,"Россия","",270,1700,
                0,"Ленинградского вокзала","Ленинград-Пассажирский",8,0);
        leningrad.print();

        Bus coi = new Bus("Vazik","Tazik",1898,"Россия","Белый",100,0);
        coi.print();
        Bus jiv = new Bus("Mrazik","Bazik",1828,"Россия","Черный",120,0);
        jiv.print();
        Bus orNot = new Bus("Last","Breach",1898,"Россия","Голубой",200,0);
        orNot.print();
        Herbivore gazelle = new Herbivore("Олег",23,130,"Россия","травоядный");
        gazelle.print();
        Herbivore giraffe = new Herbivore("Бул",232,1302,"Узбекистан","травоядный");
        giraffe.print();
        Herbivore horse = new Herbivore("Анвар",21,110,"Казахстан","травоядный");
        horse.print();

        Predator hyena = new Predator("Анвар",21,110,"Казахстан","Мясо");
        hyena.print();
        Predator tiger = new Predator("Леф",11,210,"Казахстан","Мясо");
        tiger.print();
        Predator bear= new Predator("Егор",21,90,"Россия","Мясо");
        bear.print();

        amphibians frog = new amphibians("Шайтан",21,"Казахстан");
    }


}