public class ResidentialSite extends Site {


    public ResidentialSite(int _units, double _rate) {
        super(_units, _rate);
    }


    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }


    protected double getBaseAmount() {
        return _units * _rate;
    }
}
