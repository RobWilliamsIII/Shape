abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Area of the rectangle = " + area() + "\nand the perimeter = " + perimeter() + "\n";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Area for a circle is PI * radius^2
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Area of the circle = " + area() + "\nand the perimeter = " + perimeter() + "\n";
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Use Heron's formula to calculate ara of triangle as we will initialize with 3 known side lengths
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Area of the triangle = " + area() + "\nand the perimeter = " + perimeter();
    }
}

// Driver class to instantiate one instance of each shape
class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];

        shapeArray[0] = new Rectangle(12.5, 25.0);
        shapeArray[1] = new Circle(3.5);
        shapeArray[2] = new Triangle(7.0, 8.0, 9.0);

        for (int i = 0; i < 3; i++) {
            System.out.println(shapeArray[i]);
        }
    }
}