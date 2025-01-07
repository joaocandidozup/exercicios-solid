package exercice3.good;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(3);

        System.out.println("Área do Retângulo: " + rectangle.getArea());
        System.out.println("Área do Quadrado: " + square.getArea());
    }
}
