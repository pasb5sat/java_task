public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int size) {
        circles = new Circle[size];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        circles[numberOfCircles] = circle;
        numberOfCircles++;
    }

    public void printCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            int radius = circle.getRadius();
            System.out.println("Circle " + (i + 1) + ": Center(" + center.getX() + ", " + center.getY() + "), Radius: " + radius);
        }
    }
}
