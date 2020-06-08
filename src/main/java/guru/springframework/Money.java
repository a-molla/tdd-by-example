package guru.springframework;

public class Money {
    protected int amount;

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj.getClass().equals(this.getClass()))) {
            return false;
        }
        return ((Money) obj).getAmount() == this.amount;
    }
}
