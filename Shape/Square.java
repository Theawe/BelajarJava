package Shape;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }

    public Square(double side,String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString(){
        return "A Square with side = "+getSide()+ ", which is a subclass of " + super.toString();//, where yyy is the output of the toString() method from the superclass.
    }

    public double getArea(){
        return getSide()*getSide();
    }

    public double getPerimeter(){
        return 4 * getSide();
    }

}
