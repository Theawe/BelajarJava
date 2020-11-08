package Shape;

public class ShapeTest {
    
    public static void main(String[] args) {
        Shape shape = new Shape("black", true);
        System.out.println(shape.toString());

        Square kotak = new Square(10.0);
        Rectangle persegi = new Rectangle();

        

        System.out.println(persegi.getWidth());
        // kotak.setWidth(10);
        
        System.out.println(kotak.getSide());
        

        System.out.println(kotak.toString());
        
    }
}
