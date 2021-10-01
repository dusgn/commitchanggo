package me.dusgn.chapter09;

// class Point implements Cloneable {
//    int x;
//    int y;
//
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return "x = " + x + ", y = " + y;
//    }
//
//    @Override
//    public Point clone() throws CloneNotSupportedException {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException cloneNotSupportedException) {}
//        return (Point) obj;
//    }
//
//}
//
//public class CloneEx1 {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Point original = new Point(3, 5);
//        Point copy = original.clone();
//        System.out.println(original);
//        System.out.println(copy);
//    }
//}
