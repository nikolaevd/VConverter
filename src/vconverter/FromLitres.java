
package vconverter;

public class FromLitres implements IFromValue {

    @Override
    public double toCubes(double quantity) {
        return quantity / 1000;
    }

    @Override
    public double toLiters(double quantity) {
        return quantity;
    }

    @Override
    public double toGallons(double quantity) {
        return quantity * 0.264172;
    }

    @Override
    public double toHalfLitres(double quantity) {
        return quantity / 2;
    }

    @Override
    public double toBuckets(double quantity) {
        return quantity / 12;
    }
    
}
