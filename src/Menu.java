import java.util.Collections;
import java.util.List;

/**
 *
 * Меню. Список блюд
 *
 */
public class Menu {

    //todo Создайте свое меню. Должен быть хотя бы один конструктор, который создает объект класса Menu, содержащий список не менее чем из 10 блюд.
    //todo Должно быть не менее 10 блюд.
    //todo Список должен быть не пуст
    //todo Это намеки на создание тестов. Сначала тесты, потом реализация!

    /**
     * Возвращает список блюд в меню.
     * Должен быть неизменяемым. @see Collections.unmodifiableList
     * Должен возвращать одну и ту же коллекцию объектов при кажом вызове.
     * @return список блюд в меню
     */

    private List<Meal> meals;

    public Menu(){
        meals.add(new Meal("Пельмени", "Вкусно"));
        meals.add(new Meal("Борщ", "Вкусно"));
        meals.add(new Meal("Фаршированный перец", "Беее"));
        meals.add(new Meal("Котлеты из курицы", "Вкусно"));
        meals.add(new Meal("Щи", "Беее"));
        meals.add(new Meal("Пицца", "Очень вкусно"));
        meals.add(new Meal("Паста", "Очень вкусно"));
        meals.add(new Meal("Роллы", "Беее"));
        meals.add(new Meal("Гречка с грибами", "Вкусно"));
        meals.add(new Meal("Чай", "Вкусно"));
    }

    public List<Meal> list(){
        //todo
        return meals;
    }

}
