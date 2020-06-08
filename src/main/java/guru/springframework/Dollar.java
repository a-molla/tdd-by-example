package guru.springframework;

public class Dollar {
    private int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dollar))
            return false;

        Dollar dollar = (Dollar) obj;
        return amount == dollar.getAmount();
    }
}
