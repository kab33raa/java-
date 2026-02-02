public class Classtudents {

    int rollno;
    String name;
    int marks;

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Classtudents s1 = new Classtudents();
        Classtudents s2 = new Classtudents();

        s1.rollno = 1;
        s1.name = "RAHUL";
        s1.marks = 85;

        s2.rollno = 2;
        s2.name = "MANISH";
        s2.marks = 55;

        s1.display();
        s2.display();
    }
}
