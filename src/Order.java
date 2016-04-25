import java.util.List;

/**
 * Заказ
 */
public class Order {
    /**
     * Добавить одно блюдо в заказ.
     *
     * todo TESTS!
     * todo Блюдо должно быть из меню.
     * todo Блюдо должно быть не null.
     *
     * @param meal блюдо из меню
     */

    public List<Meal> productList;
    public void addMeal(Meal meal, int col){
        for(int i=1; i<=col;i++){
            productList.add(meal);
        }
        throw new UnsupportedOperationException();
    }

    //todo добавить возможность добавления нескольких порций  одного блюда, например, два чая.
    //todo addMeal(teaMeal, 2)
    //todo TESTS!
}
