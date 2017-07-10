package list;

import java.util.Scanner;

/**
 * Created by adg on 2017-07-10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        list.List list = new list.ArrayList(100);
//        list.List list = new list.LinkedList();
        List list = new Collection();

        Boolean run = true;

        while(run) {
            list.printMenu();
            int select = scanner.nextInt();
            switch(select) {
                case 1 :
                    list.add();
                    break;
                case 2 :
                    list.printAll();
                    break;
                case 3 :
                    list.printSelect();
                    break;
                case 4 :
                    list.getLength();
                    break;
                case 5 :
                    list.delete();
                    break;
                case 6 :
                    list.clearList();
                    break;
                case 7 :
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
            }
        }

    }
}
