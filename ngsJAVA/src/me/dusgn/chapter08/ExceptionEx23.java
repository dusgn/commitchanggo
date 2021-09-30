package me.dusgn.chapter08;

public class ExceptionEx23 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException installException) {
            installException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void install() throws InstallException {
        try {
            startInstall();
            copy();
        } catch (SpaceException spaceException) {
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(spaceException);
            throw ie;
        } catch (MemoryException memoryException) {
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(memoryException);
            throw ie;
        } finally {
            deleteTemplate();
        }
    }
    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다");
        }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다");
//            throw new RuntimeException(new MemoryException("메모리가 부족합니다"));
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


class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}


