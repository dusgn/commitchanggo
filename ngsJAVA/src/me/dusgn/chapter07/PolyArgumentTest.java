package me.dusgn.chapter07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();

    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product() {}
}
class Tv extends Product {
    Tv() {
        super(100);
    }
    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}



class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product cart[] = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "를 구매하였습니다.");
    }
    void summary() {
        int sum = 0;
        String cartList = "";

        for (int i = 0; i < cart.length; i++) {
            if(cart[i]== null) break;
            sum += cart[i].price;
            cartList += (i==0)? "" + cart[i] : "," + cart[i];
        }
        System.out.println("구입하신 물품의 총 금액은" + sum + "원 입니다.");
        System.out.println("구입하신 제품은" + cartList + "입니다.");
    }
}
