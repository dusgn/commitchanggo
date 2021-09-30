package me.dusgn.chapter08;

public class ExceptionEx02 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10); // 0으로 나눠버리는 ArithmeticException이 발생할 가능성이 있음
            // 실수는 0으로 나누는게 금지되어 있지 않으며 예외가 발생하지 않음
            System.out.println(result);
        }
    }
}
