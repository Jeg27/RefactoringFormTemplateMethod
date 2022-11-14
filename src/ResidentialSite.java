public class ResidentialSite extends Site {

    private int _units;
    private double _rate;

    public ResidentialSite(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }


    protected double getBaseAmount() {
        return _units * _rate;
    }
}
