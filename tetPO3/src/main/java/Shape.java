
    /**
     * @brief Абстрактный класс Shape представляет геометрическую фигуру
     *
     * Предоставляет интерфейс для получения площади фигуры
     */
    public abstract class Shape {
        protected String name;  // Название фигуры

        /**
         * @brief Конструктор базового класса Shape
         * @param name Название фигуры
         */
        public Shape(String name) {
            this.name = name;
        }

        /**
         * @brief Абстрактный метод для вычисления площади фигуры
         * @return Площадь фигуры
         */
        public abstract double getArea();

        /**
         * @brief Получить название фигуры
         * @return Название фигуры
         */
        public String getName() {
            return name;
        }
    }


