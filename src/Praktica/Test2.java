package Praktica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        List<MobilePhone> phones = new ArrayList<>();

        phones.add(new MobilePhone("Samsung", "Galaxy S20", "Android", 799.99));
        phones.add(new MobilePhone("Apple", "iPhone 12", "iOS", 999.99));
        phones.add(new MobilePhone("Xiaomi", "Redmi Note 10", "Android", 299.99));

        Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int criterion;
        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - Модель");
        System.out.println("2 - Цена");
        System.out.println("3 - Операционная система");
        System.out.println("0 - Завершить программу");
        criterion = scanner.nextInt();

        switch (criterion) {
            case 1:
                System.out.println("Введите модель:");
                String model = scanner.next();
                filters.put("model", model);
                break;
            case 2:
                System.out.println("Введите максимальную цену:");
                double maxPrice = scanner.nextDouble();
                filters.put("maxPrice", maxPrice);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filters.put("os", os);
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        filterAndDisplayPhones(phones, filters);


        scanner.close();

    }

    public static void filterAndDisplayPhones(List<MobilePhone> phones, Map<String, Object> filters) {
        for (MobilePhone phone : phones) {
            boolean passFilter = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case "model":
                        if (!phone.getModel().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    case "maxPrice":
                        if (phone.getPrice() > (double) value) {
                            passFilter = false;
                        }
                        break;
                    case "os":
                        if (!phone.getOperationSystem().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный выбор критерия");
                }
            }
            if (passFilter) {
                System.out.println(phone.getBrand() + " " + phone.getModel() + " - " + phone.getPrice());
            }
        }
    }
}


class MobilePhone {

    private String brand;
    private String model;
    private String operationSystem;
    private double price;


    public MobilePhone(String brand, String model, String operationSystem, double price) {
        this.brand = brand;
        this.model = model;
        this.operationSystem = operationSystem;
        this.price = price;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
