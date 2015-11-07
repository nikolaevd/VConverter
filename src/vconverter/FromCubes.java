
package vconverter;

public class FromCubes implements IConvertLogic {

    @Override
    public double toCubes(double num) {
        return num;
    }

    @Override
    public double toLiters(double num) {
        return num * 1000;
    }

    @Override
    public double toGallons(double num) {
        return num * 264.172;
    }

    @Override
    public double toHalfLitres(double num) {
        return num * 2000;
    }

    @Override
    public double toBuckets(double num) {
        return num * (1000 / 12);
    }

}
