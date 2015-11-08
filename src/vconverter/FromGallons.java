
package vconverter;

class FromGallons extends AbstractValue {

    FromGallons(double quantity) {
        super(quantity);
    }

    @Override
    public double toCubes() {
        return quantity * 0.00378541;
    }

    @Override
    public double toLiters() {
        return quantity * 3.78541;
    }

    @Override
    public double toGallons() {
        return quantity;
    }

    @Override
    public double toHalfLiters() {
        return quantity * (3.78541 / 2);
    }
    
    @Override
    public double toBuckets() {
        return quantity * (3.78541 / 12);
    }
    
}
