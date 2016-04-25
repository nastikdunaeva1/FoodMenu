/**
 *
 * Еда. Пища. Блюдо.
 */
public class Meal {

    //todo Добавьте необходимые конструктуры и/или методы, чтобы можно было создать блюдо с указанием его наименования
    //todo Подумайте, что лучше подходит. Считается, что у блюда название не изменяется ;)

    /**
     *
     * @return наименование блюда
     */

    private	String name; // название
    private	String descriptinon; // описсание

    public Meal(String name, String description) {
        this.name = name;
        this.descriptinon = description;
    }
    public String returnName(){
        return name;
    }
}
