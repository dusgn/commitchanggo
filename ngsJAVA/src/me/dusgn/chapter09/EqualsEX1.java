package me.dusgn.chapter09;

public class EqualsEX1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1은 v2와 같습니다");
        } else {
            System.out.println("v1과 v2는 다릅니다");
        }
    }
}
class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value) {
            return true;
        } else {
            return false;
        }
    }
}
