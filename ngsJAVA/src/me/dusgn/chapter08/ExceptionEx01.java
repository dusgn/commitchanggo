package me.dusgn.chapter08;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try{
            try { } catch (Exception e) { }
        } catch (Exception e) {
            try { } catch (Exception ee) { } // catch 블럭 내에 또 하나의 try-catch문이 포함된 경우 같은 이름의 참조변수를 사용하면 안된다.
        } // try-catch의 끝

        try {

        } catch (Exception e) {

        }
    }
}
