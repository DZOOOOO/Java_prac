public class Main {
    public static void main(String[] args) {
        Coke coke = new Coke("콜라", 1000, 300);
        Coffee coffee = new Coffee("아메리카노", 3000, 400);
        RedBull redBull = new RedBull("레드불", 2800, 255);
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.info(coke);
        drinkMachine.info(coffee);
        drinkMachine.info(redBull);

    }
}

// 음료 종류 추상화
abstract class Drink {
    String name;
    int price;
    int volume;

    public Drink(String name, int price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }
}

interface DrinkInfo {
    public abstract void info(Drink drink);
}

class Coke extends Drink {
    public Coke(String name, int price, int volume) {
        super(name, price, volume);
    }
}

class Coffee extends Drink {
    public Coffee(String name, int price, int volume) {
        super(name, price, volume);
    }
}

class RedBull extends Drink {
    public RedBull(String name, int price, int volume) {
        super(name, price, volume);
    }
}

// 자판기 클래스
class DrinkMachine implements DrinkInfo {

    // 음료 정보조회
    @Override
    public void info(Drink drink) {
        System.out.println("음료 이름 : " + drink.name + ", 용량 : " + drink.volume + "ml" + ", 가격 : " + drink.price);
    }
}