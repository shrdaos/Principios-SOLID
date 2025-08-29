public class Main {
    public static void main(String[] args) {
        
        Shape rect = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(6, 4);

        
        System.out.println("Área del rectángulo: " + rect.getArea());
        System.out.println("Área del círculo: " + circle.getArea());
        System.out.println("Área del triángulo: " + triangle.getArea());

      
        Shape[] shapes = {rect, circle, triangle};

      
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sum(shapes);

       
        System.out.println("Área total: " + totalArea);
    }
}

