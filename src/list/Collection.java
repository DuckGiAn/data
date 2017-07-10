package list;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by adg on 2017-07-11.
 */
public class Collection implements List{
    private Map<String, Data> bookList = new TreeMap<>();
    private Scanner scanner = new Scanner(System.in);

    public Collection() {

    }

    @Override
    public void add() {
        System.out.print("도서 제목 : ");
        String title = scanner.next();
        System.out.print("저자 : ");
        String author = scanner.next();
        System.out.print("출판사 : ");
        String publisher = scanner.next();
        bookList.put(title, new Data(title, publisher, author));
    }

    @Override
    public void delete() {
        System.out.print("찾을 도서의 제목을 입력 : ");
        String title = scanner.next();

        bookList.remove(title);
//        try {
//
//        }catch(NullPointerException e) {
//            System.out.println("도서가 존재하지 않습니다.");
//        }

    }

    @Override
    public void printSelect() {
        System.out.print("찾을 도서의 제목을 입력 : ");
        String title = scanner.next();

        try {
            System.out.println("도서 제목 : " + bookList.get(title).getTitle());
            System.out.println("저자 : " + bookList.get(title).getAuthor());
            System.out.println("출판사 : " + bookList.get(title).getPublisher());
        } catch (NullPointerException e) {
            System.out.println("도서가 존재하지 않습니다.");
        }
    }

    @Override
    public void printAll() {
        for(Map.Entry<String, Data> entry : bookList.entrySet()) {
            System.out.println("도서 제목 : " + entry.getValue().getTitle());
            System.out.println("저자 : " + entry.getValue().getAuthor());
            System.out.println("출판사 : " + entry.getValue().getPublisher());
        }
    }

    @Override
    public void getLength() {
        System.out.println(bookList.size());
    }

    @Override
    public void clearList() {
        bookList = new TreeMap<>();
    }
}
