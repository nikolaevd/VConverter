
package vconverter;

public class FromHalfLitres implements IFromValue {

    @Override
    public double toCubes(double quantity) {
        return quantity / 2 * 0.001;
    }

    @Override
    public double toLiters(double quantity) {
        return quantity / 2;
    }

    @Override
    public double toGallons(double quantity) {
        return quantity / 2 * 0.264172;
    }

    @Override
    public double toHalfLitres(double quantity) {
        return quantity;
    }

    @Override
    public double toBuckets(double quantity) {
        return quantity / 2 * 12;
    }
    
}
