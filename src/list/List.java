package list;

/**
 * Created by adg on 2017-07-10.
 */
public interface List{
    void add();
    void delete();
    void printSelect();
    void printAll();
    void getLength();
    void clearList();

    default void printMenu(){
        System.out.println("1. 도서 추가 | 2. 전체 출력 | 3. 선택 출력 | 4. 도서 보유량 | 5. 도서 삭제 | 6. 초기화 | 7. 종료");
    }
}
