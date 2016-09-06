package module4.offline3.triangle;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private double slideAB;
    private double slideBC;
    private double slideAC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        this.slideAB = getLength(pointA, pointB);
        this.slideAB = getLength(pointB, pointC);
        this.slideAB = getLength(pointA, pointC);
    }

    private double calcuatePerimeter() {
        return slideAB + slideBC + slideAC;
    }

    //private double calculateArea() {}

    private void print() {
     //   System.out.println("Perimeter: " + calcuatePerimeter() + " Area: " + calculateArea());
    }

    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX() - pointB.getX(), 2) + Math.pow(pointA.getY() - pointB.getY(), 2));
    }

    //private boolean isTriangle() {}
}
