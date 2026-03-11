import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

        private Circle circle;

        @BeforeAll
        static void initAll() {
            // Сложное: Инициализация счетчика
            Circle.circlesCreated = 0;
            System.out.println("Тесты запущены. Счетчик сброшен.");
        }

        @BeforeEach
        void setUp() {
            // Простое и Среднее: создание круга с радиусом 5
            circle = new Circle(5.0);
        }

        @AfterEach
        void tearDown() {
            // Сложное: проверка увеличения счетчика
            System.out.println("Кругов создано: " + Circle.circlesCreated);
        }

        @AfterAll
        static void tearDownAll() {
            // Сложное: вывод общего количества
            System.out.println("Всего создано кругов: " + Circle.circlesCreated);
        }

        @Test
        @DisplayName("Задание 1: Проверка радиуса")
        void testRadius() {
            assertEquals(5.0, circle.getRadius(), "Радиус должен быть 5.0");
        }

        @Test
        @DisplayName("Задание 2: Проверка площади (~78.54)")
        void testArea() {
            // Использование delta для сравнения double
            assertEquals(78.54, circle.getArea(), 0.01, "Площадь неверна");
        }

        @Test
        @DisplayName("Задание 2: Проверка длины окружности (~31.42)")
        void testCircumference() {
            assertEquals(31.42, circle.getCircumference(), 0.01, "Длина неверна");
        }
    }