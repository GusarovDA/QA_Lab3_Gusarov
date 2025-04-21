/**
 * @brief Класс Circle представляет круг
 *
 * Наследует класс Shape. Содержит радиус
 * \f$ A = \pi \cdot r^2 \f$
 * \image html Circle.jpg
 */
public class Circle extends Shape {
    private double radius;  // Радиус круга

    /**
     * @brief Конструктор класса Circle
     * @param radius Радиус круга
     */
    public Circle(double radius) {
        super("Круг"); // Передаём имя в конструктор родителя
        this.radius = radius;
    }

    /**
     * @brief Вычисляет площадь круга
     * @return Площадь круга
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

