public class Main {
    public static void main(String[] args) {
        Point center1 = new Point(3, 4);
        Circle circle1 = new Circle(center1, 5);

        Point center2 = new Point(1, 2);
        Circle circle2 = new Circle(center2, 3);

        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.printCircles();

    }
}
