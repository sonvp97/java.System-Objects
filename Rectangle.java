public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width,double height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "A Rectangle with width = " + width + " and length= " + height
                + ", which is a subclass of " + super.toString();
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
