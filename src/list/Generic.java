package list;

import java.lang.reflect.Array;

/**
 * Created by adg on 2017-07-10.
 */
public class Generic<T>{
    private T[] t;
    private int count;

    public Generic(Class<T> t) {
        this.t = (T[]) Array.newInstance(t, 100);
        count = 0;
    }
    //객체 생성할 때 클래스명.class로 초기화 해야됨
    //제네릭은 강한 타입 검사를 할 수 있다는 장점이 있는데
    //리플렉션은 제네릭의 강한 타입 검사를 도와주는 역할을 해준다.


    public void add(T t) {
        this.t[count] = t;
        count++;
    }


    public void delete() {

    }


    public void printSelect() {

    }


    public void printAll() {
    }


    public void getLength() {

    }


    public void clearList() {

    }
}
