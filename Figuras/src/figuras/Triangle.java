package figuras;

public class Triangle extends Shape {
    private double widht;
    private double height;    
    private int tipo;
    
    public Triangle(double widht, double height, int tipo, int numSides) {
        super(numSides);
        this.widht = widht;
        this.height = height;
        this.tipo=tipo;
    }

    public Triangle(int tipo, int numSides) {
        super(numSides);
        this.tipo = tipo;
    }
    
    

    @Override
    double getArea() {
        double area = (widht*height)/2;
        return area;
    }

    @Override
    double getPerimeter() {
        double c=0;
        double per=0;
        switch (tipo){
            case 1:
                c = Math.sqrt((Math.pow(height,2))+(Math.pow(widht,2))-(2*height*widht*(Math.cos(Math.toRadians(90)))));
                per = c+widht+height;
                break;
            case 2:
                c = Math.sqrt((Math.pow(height,2))+(Math.pow((widht/2),2))-(2*height*(widht/2)*(Math.cos(Math.toRadians(90)))));
                per = (c*2)+widht;
                break;
        }
        return per;
    }
    
    
    
}
