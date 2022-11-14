public class LifelineSite extends Site {

    private int _units;
    private double _rate;


    public LifelineSite(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }


    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
