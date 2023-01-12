import java.lang.Math.*;
import java.util.*;

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
        return "La distance entre l'origine et le point (2, 3) est : " + distance(this.x, this.y);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir le nombre d'elements: ");
        int nbrElements = Integer.parseInt(sc.nextLine());
        Point [] points = new Point[nbrElements];

        for(int i = 0; i < points.length; i++) {

            System.out.print("Saisir l'origine du point " + (i+1) + ": ");
            double depart = Double.parseDouble(sc.nextLine());
            System.out.println();
            System.out.print("Saisir la position d'arrivee du point " + (i+1) + ": ");
            double arrivee = Double.parseDouble(sc.nextLine());

            Point point = new Point(depart, arrivee);
            points[i] = point;
        }
        

        for(int i = 0; i < points.length; i++) {
            System.out.println(points[i].toString()); 
        }              

    }
}