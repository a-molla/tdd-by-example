package guru.springframework;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency(){
        return currency;
    };


    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public int getAmount() {
        return amount;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money added){
        return new Sum(this, added);
    }

    @Override
    public Money reduce(Bank bank, String to){
        return new Money(amount / bank.rate(currency, to), to);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Money money = (Money) obj;
        return this.amount == money.getAmount() && this.currency.equals(money.currency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
