public class ResidentialSite extends Site {

    private int _units;
    private double _rate;


    public ResidentialSite(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
