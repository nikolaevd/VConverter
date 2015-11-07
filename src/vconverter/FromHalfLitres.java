
package vconverter;

public class FromHalfLitres implements IConvertLogic {

    @Override
    public double toCubes(double num) {
        return num / 2 * 0.001;
    }

    @Override
    public double toLiters(double num) {
        return num / 2;
    }

    @Override
    public double toGallons(double num) {
        return num / 2 * 0.264172;
    }

    @Override
    public double toHalfLitres(double num) {
        return num;
    }

    @Override
    public double toBuckets(double num) {
        return num / 2 * 12;
    }
    
}
