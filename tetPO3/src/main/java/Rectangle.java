/**
 * @brief Класс Rectangle представляет прямоугольник
 *
 * Содержит ширину и высоту
 * \f$ A = width \cdot height \f$
 * \image html Rectangle.jpg
 */
public class Rectangle extends Shape {
    private double width;   // Ширина
    private double height;  // Высота

    /**
     * @brief Конструктор класса Rectangle
     * @param width Ширина прямоугольника
     * @param height Высота прямоугольника
     */
    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    /**
     * @brief Вычисляет площадь прямоугольника
     * @return Площадь прямоугольника
     */
    @Override
    public double getArea() {
        return width * height;
    }
}

