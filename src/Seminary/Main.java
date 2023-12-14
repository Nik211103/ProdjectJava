package Seminary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        String str;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while(flag){
            System.out.println(">>> ");
            str = scanner.nextLine();
            String[] strArr = str.split("~");
            int num = Integer.parseInt(strArr[1]);
            if(strArr[0].equals("print")){
                System.out.println(list.remove(num));
                flag = false;
            }
            else if(strArr[0].equals("end")){
            }
            else{
                list.add(num, strArr[0]);
            }
        }
        System.out.println(list);
    }
}