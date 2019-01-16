package carDealership;

public class Till {

    int money;

    public int getMoney() {
        return money;
    }

    public Till(int money) {
        this.money = money;
    }

    public void putMoneyInTill(int money){
        this.money += money;
    }
}
