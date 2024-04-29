import java.util.ArrayList;
import java.util.List;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class WildcardExample {
    // Method with lower bound wildcard
    public static void drawShapesWithLowerBound(List<? super Rectangle> shapes) {
        for (Object shape : shapes) {
            if (shape instanceof Shape) {
                ((Shape) shape).draw();
            }
        }
    }

    // Method with upper bound wildcard
    public static void drawShapesWithUpperBound(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(new Rectangle());
        allShapes.add(new Circle());
        allShapes.add(new Shape());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        // Using lower bound wildcard
        System.out.println("Drawing shapes with lower bound wildcard:");
        drawShapesWithLowerBound(allShapes); // allShapes is a List<? super Rectangle>
        System.out.println();

        // Using upper bound wildcard
        System.out.println("Drawing shapes with upper bound wildcard:");
        drawShapesWithUpperBound(allShapes); // allShapes is a List<? extends Shape>
    }
}
