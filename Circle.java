interface Movable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

class Point implements Movable {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Circle {

    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void print() {
        System.out.println("Center: (" + center.x + ", " + center.y + "), Radius: " + radius);
    }
}
public class Main {

    public static void main(String[] args) {

        Point p = new Point(2, 3);
        p.print();

        p.moveUp();
        p.moveRight();
        p.print();

        Circle c = new Circle(p, 5);
        c.print();
    }
}
