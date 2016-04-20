
package figuras;


public abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }
    public int getNumSides() {
        return numSides;
    }   
    abstract double getArea();   
    abstract double getPerimeter();   
}
