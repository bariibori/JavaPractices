class Rectangle {
     float height, width; 
    float calculateArea() {
        return (height*width);
    }
    public void changeValue(Rectangle[] rec){
        rec[0].height = 2;
        rec[0].width = 2;
    }
    public void changeValueByVar(Rectangle... recs){
        recs[0].height = 4;
        recs[0].width = 4;
    }
    // constructors
    Rectangle(){ // editing the default constructor
        height = 1;width = 1;
    }
    Rectangle(float height, float width){ // parametrized constructor
        this.height = height;
        this.width = width;
    }
} 
    
    public class Boni { 
        public static void main(String[] args){
            Rectangle[] R1 = new Rectangle[1];
            R1[0] = new Rectangle();
            System.out.println("R1-height :" + R1[0]. height + " R1-width :" + R1[0].width);
            System.out.println("R1-Area" + R1[0].calculateArea());
            R1[0].changeValue(R1) ;
            System.out.println("R1-height :" + R1[0]. height + " R1-width :" + R1[0].width);
            System.out.println("R1-Area" + R1[0].calculateArea());
            Rectangle R2 = new Rectangle(5,3);
            System.out.println("R2-height :" + R2. height + " R2-width :" + R2.width);
            System.out.println("R2-Area :" + R2.calculateArea());
            R2.changeValueByVar(R1) ;
            System.out.println("R1-height :" + R1[0]. height + " R1-width :" + R1[0].width);
            System.out.println("R1-Area :" + R1[0].calculateArea());
        }
    } 
