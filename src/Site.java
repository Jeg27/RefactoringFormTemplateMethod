

public abstract class Site {

    protected static final double TAX_RATE = 0.10;
    protected int _units;
    protected double _rate;

    public Site(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount(getBaseAmount());
    }

    protected abstract double getTaxAmount(double baseAmount);

    protected abstract double getBaseAmount();

    public static void main(String[] args) {

    }
}