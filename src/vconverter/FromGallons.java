
package vconverter;

public class FromGallons implements IFromValue {

    @Override
    public double toCubes(double quantity) {
        return quantity * 0.00378541;
    }

    @Override
    public double toLiters(double quantity) {
        return quantity * 3.78541;
    }

    @Override
    public double toGallons(double quantity) {
        return quantity;
    }

    @Override
    public double toHalfLitres(double quantity) {
        return quantity * (3.78541 / 2);
    }

    @Override
    public double toBuckets(double quantity) {
        return quantity * (3.78541 * 12);
    }
    
}
