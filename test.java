class Circle{
    double radius;
    // constructor used when radius is specified
    Circle(double rad){
        radius = rad;
    }
        void displayAreaOfCircle(){
            System.out.println("Area of the circle is:" + (Math.PI * radius * radius));}}
class Cylinder extends Circle{
    double height;
     Cylinder(double rad, double hei){
        //constructor for Cylinder
        radius = rad;
        height = hei;}
        void displayAreaOfCylinder(){
            System.out.println("Area of the cylinder is:" + (Math.PI * radius * radius * height));}}
            public class test {
                public static void main(String[] args) {
                Cylinder cyl = new Cylinder(2.3, 4.4);
                System.out.println("Super Class Method call : " );
                cyl. displayAreaOfCircle();
                System.out.println("Sub Class Method call :" );
                cyl. displayAreaOfCylinder();
                Circle cir = new Circle(5);
                System.out.println("Super Class Method call : " );
                cir. displayAreaOfCircle();}} 
