public class Circle {
    private double radius;
    // Сложное: статический счетчик
    public static int circlesCreated = 0;

    public Circle(double radius) {
        this.radius = radius;
        circlesCreated++; // Увеличение при создании
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
