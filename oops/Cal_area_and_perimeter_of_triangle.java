public class Cal_area_and_perimeter_of_triangle {
    int side1,side2,side3;
    public Cal_area_and_perimeter_of_triangle(int side1,int side2,int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int area(){
        int s = (side1+side2+side3)/2;
        return (int) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public int perimeter(){
        return side1+side2+side3;
    }
    public static void main(String[] args) {
        Cal_area_and_perimeter_of_triangle triangle1 = new Cal_area_and_perimeter_of_triangle(3, 4, 5);
       System.out.println(triangle1.area()); 
       System.out.println(triangle1.perimeter()); 
    }
    
}
