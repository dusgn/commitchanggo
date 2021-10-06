package me.dusgn.chapter11;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);   // 용량(capacity)이 5인 Vector를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 빈 공간을 없앤다.(용량과 크기가 같아진다.)
        System.out.println("===== After trimToSize() =====");
        print(v);

        v.ensureCapacity(6);
        System.out.println("===== After ensureCapacity() =====");
        print(v);

        v.setSize(7);
        System.out.println("===== After setSize() =====");
        print(v);

        v.clear();
        System.out.println("===== After clear() =====");
        print(v);
    }

    public static void print(Vector vector) {
        System.out.println(vector);
        System.out.println("size : " + vector.size());
        System.out.println("capacity : " + vector.capacity());
    }
}
