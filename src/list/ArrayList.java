package list;

import java.util.Scanner;

/**
 * Created by adg on 2017-07-10.
 */
public class ArrayList implements List {
    private Data[] bookList;
    private int count;
    private int length;
    Scanner scanner = new Scanner(System.in);

    public ArrayList(int length) {
        bookList = new Data[length];
        count = 0;
    }

    @Override
    public void add() {
        System.out.print("도서 제목 : ");
        String title = scanner.next();
        System.out.print("저자 : ");
        String author = scanner.next();
        System.out.print("출판사 : ");
        String publisher = scanner.next();
        bookList[count] = new Data(title, publisher, author);
        count++;
    }

    @Override
    public void delete() {
        int index = find();

        if(index == -1) {
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        for(int i = index; i < count; i++) {
            bookList[i] = bookList[i+1];
        }
        count--;
    }

    @Override
    public void printSelect() {
        int index = find();

        if(index == -1) {
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        System.out.println("도서 제목 : " + bookList[index].getTitle());
        System.out.println("저자 : " + bookList[index].getAuthor());
        System.out.println("출판사 : " + bookList[index].getPublisher());

    }

    private int find() {
        System.out.print("찾을 도서의 제목을 입력 : ");
        String title = scanner.next();

        for(int i = 0; i < count; i++) {
            if(bookList[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printAll() {
        if(count < 1) {
            System.out.println("도서가 존재하지 않습니다.");
            return ;
        }

        for(int i = 0; i < count; i++) {
            System.out.println("도서 제목 : " + bookList[i].getTitle());
            System.out.println("저자 : " + bookList[i].getAuthor());
            System.out.println("출판사 : " + bookList[i].getPublisher());
        }
    }

    @Override
    public void getLength() {
        System.out.println(count);
    }

    @Override
    public void clearList() {
        bookList = new Data[length];
    }
}
