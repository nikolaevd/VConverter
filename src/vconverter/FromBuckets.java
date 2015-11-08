
package vconverter;

class FromBuckets extends AbstractFromValue {

    FromBuckets(double quantity) {
        super(quantity);
    }

    @Override
    public double toCubes() {
        return quantity * 12 * 0.001;
    }

    @Override
    public double toLiters() {
        return quantity * 12;
    }

    @Override
    public double toGallons() {
        return quantity * 12 * 0.264172;
    }

    @Override
    public double toHalfLiters() {
        return quantity * 12 * 2;
    }

    @Override
    public double toBuckets() {
        return quantity;
    }
    
}
