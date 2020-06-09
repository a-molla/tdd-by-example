package guru.springframework;

public interface Expression {
    Expression plus(Expression added);
    Money reduce(Bank bank, String to);
}
