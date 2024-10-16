package test06;

public class Coordinate {
    private double x;
    private double y;

    Coordinate(double x, double y) {this.x = x; this.y = y;}

    double getX() {return x;}
    double getY() {return y;}

    void set(double x, double y) {this.x = x; this.y = y;}
}
