
package vconverter;

abstract class AbstractFromValue {
    
    double quantity;
    
    AbstractFromValue(double quantity){
        this.quantity = quantity;
    }
    
    abstract double toCubes();
    abstract double toLiters();
    abstract double toGallons();
    abstract double toHalfLiters();
    abstract double toBuckets();
    
}
