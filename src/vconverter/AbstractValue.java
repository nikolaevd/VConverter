
package vconverter;

abstract class AbstractValue {
    
    double quantity;
    
    AbstractValue(double quantity){
        this.quantity = quantity;
    }
    
    abstract double toCubes();
    abstract double toLiters();
    abstract double toGallons();
    abstract double toHalfLiters();
    abstract double toBuckets();
    
}
