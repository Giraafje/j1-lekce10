package cz.czechitas.lekce10.operace;

/**
 * Operace druhé odmocniny.
 *
 * @author Filip Jirsák
 */
public class DruhaOdmocnina implements Operace {
    private int a;
    private static final int MAX_ALLOWED_VALUE = 99_999_999;

    @Override
    public void setA(int a) {
        if (a > MAX_ALLOWED_VALUE || a < 0) {
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
    }

    @Override
    public int getB() {
        return 0;
    }

    @Override
    public int getPocetOperandu() {
        return 1;
    }

    @Override
    public String vypocet() {
        int vysledek = (int) Math.sqrt(a);
        return "√%d = %d".formatted(a, vysledek);
    }
}
