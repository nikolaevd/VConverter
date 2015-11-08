
package vconverter;

public class FromBuckets implements IFromValue {

    @Override
    public double toCubes(double quantity) {
        return quantity * 12 * 0.001;
    }

    @Override
    public double toLiters(double quantity) {
        return quantity * 12;
    }

    @Override
    public double toGallons(double quantity) {
        return quantity * 12 * 0.264172;
    }

    @Override
    public double toHalfLitres(double quantity) {
        return quantity * 12 * 2;
    }

    @Override
    public double toBuckets(double quantity) {
        return quantity;
    }
    
}
