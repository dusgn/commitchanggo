package me.dusgn.chapter08;

import java.sql.SQLOutput;

public class ExceptionEx21 {
    public static void main(String[] args) {
        try {
            startInstall();
            copy();
        } catch (SpaceException spaceException) {
            System.out.println("에러메세지:" + spaceException.getMessage());
            spaceException.printStackTrace();
            System.out.println("설치 공간을 확보해주세요");
        } catch (MemoryException memoryException) {
            System.out.println("에러메세지:" + memoryException.getMessage());
            memoryException.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요");
        } finally {
            deleteTemplate();
        }
    }
    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다");
        }
    }
    static void copy() {}
    static void deleteTemplate() {

    }
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
