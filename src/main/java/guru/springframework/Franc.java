package guru.springframework;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int amount) {
        return new Franc(amount * this.amount);
    }
}
