package W7;

public class Rectangle implements Measurable{
    private double myWidth;
    private double myHeight;

    public Rectangle(double wid, double hei){
        myHeight = wid;
        myHeight = hei;
    }

    public double getPerimeter(){
        return 2*(myWidth + myHeight);

    }
    public double getArea(){
        return (myWidth * myHeight);
    }

}
