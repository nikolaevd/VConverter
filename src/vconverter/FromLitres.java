
package vconverter;

public class FromLitres implements IConvertLogic {

    @Override
    public double toCubes(double num) {
        return num / 1000;
    }

    @Override
    public double toLiters(double num) {
        return num;
    }

    @Override
    public double toGallons(double num) {
        return num * 0.264172;
    }

    @Override
    public double toHalfLitres(double num) {
        return num / 2;
    }

    @Override
    public double toBuckets(double num) {
        return num / 12;
    }
    
}
