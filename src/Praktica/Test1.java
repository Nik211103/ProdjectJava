package Praktica;

public class Test1 {
//    Создайте класс Product с приватными переменными name (тип String) и price (тип double).
//    Добавьте методы getName() и setName(), а также getPrice() и setPrice() для доступа к этим переменным.
    public static void main(String[] args) {
        Product cheese = new Product();
        cheese.setName("Сыр");
        cheese.setPrice(12.36);
        System.out.println("Продукт "+cheese.getName()+" стоит: "+cheese.getPrice());
    }
}
class Product{
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
