
package vconverter;

class FromCubes extends AbstractValue {

    FromCubes(double quantity) {
        super(quantity);
    }

    @Override
    public double toCubes() {
        return quantity;
    }

    @Override
    public double toLiters() {
        return quantity * 1000;
    }

    @Override
    public double toGallons() {
        return quantity * 264.172;
    }

    @Override
    public double toHalfLiters() {
        return quantity * 2000;
    }

    @Override
    public double toBuckets() {
        return quantity * (1000 / 12);
    }

}
