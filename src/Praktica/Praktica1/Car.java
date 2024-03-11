package Praktica.Praktica1;

/*Создайте класс "Автомобиль" с полями (марка, модель, год выпуска) и методами для получения и изменения этих полей.
 Реализуйте наследование, создав классы "Легковой автомобиль" и "Грузовой автомобиль", унаследовав их от класса "Автомобиль".
 Напишите программу, используя API для работы с файлами, которая считывает содержимое текстового файла и выводит его на экран.*/
public class Car {
    String mark, model;
    int years;

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYears() {
        return years;
    }

    public Car(String mark, String model, int years) {
        this.mark = mark;
        this.model = model;
        this.years = years;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
