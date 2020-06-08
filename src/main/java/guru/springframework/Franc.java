package guru.springframework;

public class Franc {
    int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Franc times(int amount) {
        return new Franc(amount * this.amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Franc) {
            return this.amount == ((Franc) obj).getAmount();
        }
        return false;
    }
}
