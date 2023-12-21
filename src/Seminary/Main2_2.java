package Seminary;

import java.util.HashSet;
import java.util.Set;

/*Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java*/
public class Main2_2 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 10;
        cat1.poroda = "Svinks";
        cat1.ownerName = "Vova Ivanov";

        Cat cat2 = new Cat();
        cat2.name = "Murzik";
        cat2.age = 9;
        cat2.poroda = "Homes";
        cat2.ownerName = "Kiril Petrovich";

        Cat cat3 = new Cat();
        cat3.name = "Myrka";
        cat3.age = 8;
        cat3.poroda = "Persid";
        cat3.ownerName = "Semen Ivanov";

        Cat cat4 = new Cat();
        cat4.name = "Ryzic";
        cat4.age = 9;
        cat4.poroda = "British";
        cat4.ownerName = "Vasya Pypkin";

        Cat cat5 = new Cat();
        cat5.name = "Ryzic";
        cat5.age = 9;
        cat5.poroda = "British";
        cat5.ownerName = "Vasya Pypkin";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(cats);

    }
    static void printSet(Set<Cat> cats){
        for (Cat cat: cats) {
            System.out.println(cat);

        }

    }
}

