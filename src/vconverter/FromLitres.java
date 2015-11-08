
package vconverter;

class FromLitres extends AbstractFromValue {

    FromLitres(double quantity) {
        super(quantity);
    }

    @Override
    public double toCubes() {
        return quantity / 1000;
    }

    @Override
    public double toLiters() {
        return quantity;
    }

    @Override
    public double toGallons() {
        return quantity * 0.264172;
    }

    @Override
    public double toHalfLitres() {
        return quantity / 2;
    }

    @Override
    public double toBuckets() {
        return quantity / 12;
    }
    
}
