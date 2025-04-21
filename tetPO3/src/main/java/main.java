public class main {
    public static void main(String[] args) {
        // Создаём фигуры разных типов
        Shape circle = new Circle(5.0);
        Shape rect = new Rectangle(4.0, 4.0);

        // Создаём печатальщика информации и выводим всё
        ShapePrinter printer = new ShapePrinter();
        printer.printShapeInfo(circle);
        printer.printShapeInfo(rect);
    }
}
