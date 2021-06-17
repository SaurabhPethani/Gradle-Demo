package Calculator.Gradle;

public class Addition implements  Calculation {
    @Override
    public double operation(double a, double b) {
        return a+b;
    }
}
