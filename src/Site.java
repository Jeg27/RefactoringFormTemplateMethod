

public abstract class Site {

    protected static final double TAX_RATE = 0.10;

    public Site() {
    }

    public static void main(String[] args) {

    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount(getBaseAmount());
    }

    protected abstract double getTaxAmount(double baseAmount);

    protected abstract double getBaseAmount();
}