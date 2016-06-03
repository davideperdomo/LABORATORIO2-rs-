package figuras;


public class Rectangle extends Shape {
    private double widht;
    private double height;

    public Rectangle(double widht, double height, int numSides) {
        super(numSides);
        this.widht = widht;
        this.height = height;
    }

    

    @Override
    double getArea() {
        double area = widht*height;
        return area;
    }

    @Override
    double getPerimeter() {
        double per = (widht*2)+(height*2);
        return per;
    }
    
}
