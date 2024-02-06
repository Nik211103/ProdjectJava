package Extention;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    static Map<String, String> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        String filePathForRead = "src/Extention/test1.txt";
        String filePathForWrite = "src/Extention/test.txt";
        try {
            readFile(filePathForRead);
            writeToFile(filePathForWrite);
        } catch (FileNotFoundException e){
            System.out.println("Не удалось считать файл");
        } catch (IOException e){
            System.out.println("Не удалось записать файл");
        }
    }

    static void writeToFile(String filePath) throws IOException {
       try(FileWriter writer = new FileWriter(filePath)) {
           for (Map.Entry<String, String> entry : map.entrySet()) {
               writer.write(entry.toString());
               writer.write("\n");
           }
       }
    }

    static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                parseLine(scanner);
            }
        }
    }

    private static void parseLine(Scanner scanner) {
        String line = scanner.nextLine();
        String[] arr = line.split("=");
        if (arr[1].equals("?")) {
            arr[1] = String.valueOf(arr[0].length());
        }
        map.put(arr[0], arr[1]);
    }


}
