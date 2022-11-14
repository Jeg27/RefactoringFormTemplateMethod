public class LifelineSite extends Site {

    private int _units;
    private double _rate;


    public LifelineSite(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    public double getBillableAmount() {
        double tax = getTaxAmount(getBaseAmount());
        return getBaseAmount() + tax;
    }

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
