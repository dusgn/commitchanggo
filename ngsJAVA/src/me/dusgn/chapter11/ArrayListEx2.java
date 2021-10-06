package me.dusgn.chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    // 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하는 예제
    public static void main(String[] args) {
        final int LIMIT = 10;   // 자르고자 하는 글자의 갯수 지정
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();   // 43

        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {   // 0 10 20 30 40
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
