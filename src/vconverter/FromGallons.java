
package vconverter;

public class FromGallons implements IConvertLogic {

    @Override
    public double toCubes(double num) {
        return num * 0.00378541;
    }

    @Override
    public double toLiters(double num) {
        return num * 3.78541;
    }

    @Override
    public double toGallons(double num) {
        return num;
    }

    @Override
    public double toHalfLitres(double num) {
        return num * (3.78541 / 2);
    }

    @Override
    public double toBuckets(double num) {
        return num * (3.78541 * 12);
    }
    
}
