package me.dusgn.chapter10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // getInstance()를 통해서 얻은 인스턴스는 현재 시스템의 날짜와 시간에 대한 정보를 담음
        Calendar today = Calendar.getInstance();

        System.out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));
    }
}
