package me.dusgn.chapter08;

import javafx.concurrent.Worker;

public class ExceptionEx20 {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}
class CloseableResource implements AutoCloseable {
    // 자동으로 객체의 close()가 호출되려면 AutoCloseable이 구현되어야 함
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ") 가 호출됨");

        if (exception) {
            throw new WorkException("WorkException발생!!");
        }
    }
    public void close() throws CloseException {
        System.out.println("close가 호출됨");
        throw new CloseException("CloseException 발생");
    }
}
class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}
class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}