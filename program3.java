public class ClassRectangle {

    int length;
    int breadth;

    void area() {
        int a = length * breadth;
        System.out.println("Area = " + a);
    }

    public static void main(String[] args) {
        ClassRectangle r = new ClassRectangle();
        r.length = 10;
        r.breadth = 5;
        r.area();
    }
}
