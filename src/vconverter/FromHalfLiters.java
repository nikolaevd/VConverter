
package vconverter;

class FromHalfLiters extends AbstractValue {

    FromHalfLiters(double quantity) {
        super(quantity);
    }

    @Override
    public double toCubes() {
        return quantity / 2 * 0.001;
    }

    @Override
    public double toLiters() {
        return quantity / 2;
    }

    @Override
    public double toGallons() {
        return quantity / 2 * 0.264172;
    }

    @Override
    public double toHalfLiters() {
        return quantity;
    }

    @Override
    public double toBuckets() {
        return quantity / 2 * 12;
    }
    
}
