import java.lang.Math.*;

public class Point {
    private double x;
    private double y;

    public Point() {
        
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return this.y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public String toString() {
        return String.valueOf(distance(this.x, this.y));
    }

    public static void main(String args[]) {

        Point point = new Point(2, 3);
        System.out.print("La distance entre l'origine et le point (2, 3) est : " + point.distance(point.x, point.y));        

    }
}