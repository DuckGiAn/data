package list;

import java.util.Scanner;

/**
 * Created by adg on 2017-07-10.
 */
public class LinkedList implements List{
    private Node head;
    private Node tail;
    Scanner scanner = new Scanner(System.in);
    int count;

    public LinkedList() {
        head = new Node();
        tail = new Node();
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
        Node newNode = new Node(title, publisher, author);
        count++;

        if(head.getNextNode() == null) {
            head.setNextNode(newNode);
            tail.setNextNode(newNode);
            return ;
        }

        tail.getNextNode().setNextNode(newNode);
        tail.setNextNode(newNode);
    }

    @Override
    public void delete() {
        Node tmp = find();

        if(tmp == null) {
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        if(tmp.equals(head)) {
            head.setNextNode(head.getNextNode().getNextNode());
        } else {
            if(tmp.getNextNode().equals(tail.getNextNode())) {
                tail.setNextNode(tmp);
            }
            tmp.setNextNode(tmp.getNextNode().getNextNode());
        }
        count--;
    }

    @Override
    public void printSelect() {
        Node tmp = find();

        if(tmp == null) {
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        System.out.println("도서 제목 : " + tmp.getNextNode().getTitle());
        System.out.println("저자 : " +  tmp.getNextNode().getAuthor());
        System.out.println("출판사 : " +  tmp.getNextNode().getPublisher());
    }

    private Node find() {
        System.out.print("찾을 영화의 제목을 입력 : ");
        String title = scanner.next();

        Node tmp = head;
        while(!(tmp.getNextNode() == null)) {
            if(tmp.getNextNode().getTitle().equals(title)) {
                return tmp;
            }
            tmp = tmp.getNextNode();
        }
        return null;
    }

    @Override
    public void printAll() {
        Node tmp = head.getNextNode();

        if(tmp == null) {
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        while(!(tmp == null)) {
            System.out.println("도서 제목 : " + tmp.getTitle());
            System.out.println("저자 : " + tmp.getAuthor());
            System.out.println("출판사 : " + tmp.getPublisher());
            tmp = tmp.getNextNode();
        }
    }

    @Override
    public void getLength() {
        System.out.println(count);
    }

    @Override
    public void clearList() {
        head.setNextNode(null);
        tail.setNextNode(null);
    }
}
