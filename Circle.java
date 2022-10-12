public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getPerimeter(){
        return 3.14*2*radius;
    }
    public String toString(){
        return "A Circle with redius = " + getArea() +
                ", which is a subclass of " + super.toString();
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false , 3.5);
        System.out.println(circle);
    }
}
