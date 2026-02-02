class ClassmetroCity {

    String city;
    int population;

    void display() {
        System.out.println("City Name: " + city);
        System.out.println("Population: " + population);
        System.out.println();
    }

    public static void main(String[] args) {

        ClassmetroCity m1 = new ClassmetroCity();
        m1.city = "Haryana";
        m1.population = 20400000;
        m1.display();

        ClassmetroCity m2 = new ClassmetroCity();
        m2.city = "Uttar Pradesh";
        m2.population = 19000000;
        m2.display();
    }
}
