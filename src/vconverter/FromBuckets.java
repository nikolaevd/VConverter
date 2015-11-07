
package vconverter;

public class FromBuckets implements IConvertLogic {

    @Override
    public double toCubes(double num) {
        return num * 12 * 0.001;
    }

    @Override
    public double toLiters(double num) {
        return num * 12;
    }

    @Override
    public double toGallons(double num) {
        return num * 12 * 0.264172;
    }

    @Override
    public double toHalfLitres(double num) {
        return num * 12 * 2;
    }

    @Override
    public double toBuckets(double num) {
        return num;
    }
    
}
