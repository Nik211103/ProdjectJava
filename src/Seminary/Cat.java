package Seminary;

import java.util.List;

public class Cat {
    String name;
    int age;
    String poroda;
    String ownerName;//можно было бы создать отдельный класс Хозяин

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", poroda: " + poroda + ", owner: " + ownerName;
        //super обращение к родительскому классу в данном случае Object
    }
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", poroda='" + poroda + '\'' +
//                ", ownerName='" + ownerName + '\'' +
//                '}';
//    }

}
