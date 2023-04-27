public class RectangularPrism {
    public double side_a;
    public double side_b;
    public double side_h;

    public RectangularPrism(double side_a, double side_b, double side_h) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_h = side_h;
    }

    public void areaRectangularPrism() {
        double area = 2*((side_a*side_b)+(side_a*side_h)+(side_b*side_h));
        System.out.println("Площа = "+area);
    }

    public double volumeRectangularPrism(){

        return side_b*side_a*side_h;
    }













}
