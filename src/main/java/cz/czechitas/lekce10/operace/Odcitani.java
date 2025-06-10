package cz.czechitas.lekce10.operace;

/**
 * Operace odčítání dvou čísel.
 *
 * @author Filip Jirsák
 */
public class Odcitani implements Operace {
    private int a;
    private int b;
    private static final int MAX_ALLOWED_VALUE = 99_999_999;

    @Override
    public void setA(int a) {
        if (a > MAX_ALLOWED_VALUE || a < -MAX_ALLOWED_VALUE) {
            throw new IllegalArgumentException("A must be less than or equal to " + MAX_ALLOWED_VALUE);
        }
        this.a = a;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setB(int b) {
        if (b > MAX_ALLOWED_VALUE || b < -MAX_ALLOWED_VALUE) {
            throw new IllegalArgumentException("B must be less than or equal to " + MAX_ALLOWED_VALUE);
        }
        this.b = b;
    }

    @Override
    public int getB() {
        return b;
    }


    @Override
    public int getPocetOperandu() {
        return 2;
    }

    @Override
    public String vypocet() {
        int vysledek = a - b;
        if (vysledek > MAX_ALLOWED_VALUE || vysledek < -MAX_ALLOWED_VALUE) {
            throw new ArithmeticException("Result must be less than or equal to " + MAX_ALLOWED_VALUE);
        }
        return "%d - %d = %d".formatted(a, b, vysledek);
    }
}
