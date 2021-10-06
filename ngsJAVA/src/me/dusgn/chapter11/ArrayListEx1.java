package me.dusgn.chapter11;

import java.util.ArrayList;
import java.util.Collections;

import static jdk.nashorn.internal.objects.Global.print;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // subList는 읽기 전용이라 사용하고 싶으면 해당 메서드의 새 ArrayList를 만들어야함
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collection 은 인터페이스 Collections 는 클래스
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // 문자열 1 추가
        list1.add(0, "1");
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
        System.out.println("index = " + list1.indexOf("1")); // 0
        System.out.println("index = " + list1.indexOf(1));  // 2
        // boolean remove(Object obj)를 호출하지 않고 Object remove(int index)를 호출함
//        list1.remove(1);
        list1.remove(new Integer(1));
        System.out.println();

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2): "+ list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다
        // boolean contains(Object obj)
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
