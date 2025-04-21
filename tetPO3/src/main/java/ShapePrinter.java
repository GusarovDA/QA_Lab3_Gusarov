/**
 * @brief Класс ShapePrinter выводит информацию о фигурах
 *
 * Используется для демонстрации работы с объектами классов-наследников Shape
 */
public class ShapePrinter {

    /**
     * @brief Печатает имя и площадь фигуры
     * @param shape Объект фигуры
     */
    public void printShapeInfo(Shape shape) {
        // Выводим тип фигуры
        System.out.println("Фигура: " + shape.getName());
        // Выводим рассчитанную площадь
        System.out.println("Площадь: " + shape.getArea());
    }
}
