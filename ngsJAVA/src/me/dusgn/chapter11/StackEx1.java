package me.dusgn.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {


        List list = new ArrayList();
        Iterator it = list.iterator();  // iterator 객체를 반환

        while (it.hasNext()){           // 읽어올 요소가 있는지 확인하고 읽어옴
            System.out.println(it.next());
        }


        goURL("1. 네이트");
        goURL("2. 다음");
        goURL("3. 구글");
        goURL("4. 네이버");

        printStatus();

        goBack();
        System.out.println("===== 뒤로가기 ====");
        printStatus();

        goBack();
        goForward();
        System.out.println("===== 뒤로가기 후 앞으로 가기 =====");
        printStatus();

        goURL("새로운 주소");
        System.out.println("===== 새로운 주소로 이동 =====");
        printStatus();


    }

    public static void printStatus() {
        System.out.println("back:" +back);
        System.out.println("forword:" + forward);
        System.out.println("현재 화면은 '" + back.peek() + "' 입니다");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }
    public static void goForward() {
        if(!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack() {
        if(!back.empty())
            forward.push(back.pop());
    }
}
