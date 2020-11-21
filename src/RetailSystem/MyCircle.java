package src.RetailSystem;

class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
    private int x;
    private int y;
    private int XY;

    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.x = center.getX();
        this.y = center.getY();
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return x;
    }

    public void setCenterX(int x) {
        this.x = x;
    }

    public int getCenterY() {
        return y;
    }

    public void setCenterY(int y) {
        this.y = y;
    }

    public int getCenterXY() {
        return XY;
    }

    public void setCenterXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "My Circle [ radius = " + radius + ",center = (" + x + "," + y + ")]";
    }

    public double getArea() {
        double area;
        double pie = 3.1416;
        area = pie * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference() {
        double circumference;
        double pie = 3.1416;

        circumference = 2 * pie * radius;
        return circumference;
    }

    public double distance(MyCircle circle) {

        double distance = Math.sqrt(((circle.getCenterX() - x) * (circle.getCenterX() - x)) - ((circle.getCenterY() - y) * (circle.getCenterY() - y)));
        return distance;
    }


}
