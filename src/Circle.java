public class Circle {
    public void area(){
        int r= 10;
        double pi =3.14;
        double area = pi*r*r;
        System.out.println(area);
    }
    public static void main(String[]args){
        System.out.println("Area of circle");
        Circle a = new Circle();
        a.area();
    }
}
