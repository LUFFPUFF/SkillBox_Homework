package Task1;

public class Main {
    public static void main(String[] args) {
        Basket mishaBasket = new Basket();

        mishaBasket.add("Стул", 1000, 2, 5);
        mishaBasket.add("Стол", 4000, 1, 15);

        mishaBasket.print("Корзина Миши: ");
        System.out.println("Вес: " + mishaBasket.getTotalWeight() + " кг.");
        System.out.println("Конечная цена всех товаров: " + mishaBasket.getTotalPrise() + " руб.");

        System.out.println("-------------------------------------");

        Basket basket = new Basket();
        basket.add("Стекло", 2000, 3, 5);
        basket.add("Древесина", 6000, 1, 20);

        basket.print("Корзина Никиты: ");
        System.out.println("Вес: " + basket.getTotalWeight() + " кг.");
        System.out.println("Конечная цена всех товаров: " + basket.getTotalPrise() + " руб.");

        System.out.println("-------------------------------------");

        System.out.println("Кол-во товаров во всех корзинах: " + Basket.getCountProduct());
        System.out.println("Кол-во корзин: " + Basket.getCountBasket());
        System.out.println("Конечная стоимость всех корзин: " + Basket.getCountPrice());
        System.out.println("Средняя стоимость товара: " + Basket.averageCostProductInBaskets());
        System.out.println("Средня стомость корзины: " + Basket.averageCostBasket());

    }
}

