
package vconverter;

public class FromCubes implements IFromValue {

    @Override
    public double toCubes(double quantity) {
        return quantity;
    }

    @Override
    public double toLiters(double quantity) {
        return quantity * 1000;
    }

    @Override
    public double toGallons(double quantity) {
        return quantity * 264.172;
    }

    @Override
    public double toHalfLitres(double quantity) {
        return quantity * 2000;
    }

    @Override
    public double toBuckets(double quantity) {
        return quantity * (1000 / 12);
    }

}
