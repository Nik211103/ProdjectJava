package Extention.HomeWork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные (Фамилия Имя Отчество дата_рождения номер_телефона пол):");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Вы ввели неверное количество данных. Пожалуйста, введите данные в правильном формате.");
            return;
        }

        try {
            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String birthDate = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            sdf.setLenient(false);
            Date dateOfBirth = sdf.parse(birthDate);

            Date currentDate = new Date();
            if (dateOfBirth.after(currentDate)) {
                throw new IllegalArgumentException("Неверный формат даты рождения. Дата не может быть позже сегодняшней");
            }

            if (gender != 'f' && gender != 'm') {
                throw new IllegalArgumentException("Неверный формат пола. Используйте f или m");
            }

            String fileName = surname + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
            writer.close();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка при записи в файл.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
