package Seminary;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while(work){
            String line = scanner.nextLine();
            switch (line){
                case"print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
//                    for (int i = list.size()-1; i >=0; i++) {
//                        System.out.println(list.get(i));
//                    }
                    break;
                case"revert":
                    list.remove(list.size()-1);
                    break;
                case"finish":
                    break;
                default:
                    list.add(line);
            }
        }
    }
}
