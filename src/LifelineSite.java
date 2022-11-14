public class LifelineSite extends Site {

    private int _units;
    private double _rate;


    public LifelineSite(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
