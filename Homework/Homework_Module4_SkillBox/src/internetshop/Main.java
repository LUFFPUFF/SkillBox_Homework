package internetshop;

public class Main {
    public static void main(String[] args) {

        //Проверка конструктора без параметров
        Basket mishaBasket = new Basket();

        //Добавим продукты со всеми параметрами
        mishaBasket.add("Стул", 1000, 2, 5);
        mishaBasket.add("Стол", 5000, 1, 15);

        mishaBasket.print("Корзина Миши: ");
        System.out.println("Вес: " + mishaBasket.getTotalWeight() + " кг.");
        System.out.println("Прайс: " + mishaBasket.getTotalPrise() + " руб.");

        System.out.println("-------------------------------------");

        //Добавим конструктор с ограничением по весу
        //PS конструктор с ограничением по лимиту работает так же
        Basket alisaBasket = new Basket(20.0);

        //Добавим товары без количества
        alisaBasket.add("Клавиатура", 5000, 0.7);
        alisaBasket.add("Компьютер", 83000, 23.0);
        alisaBasket.add("Мышь", 2500, 0.5);

        //Можем увидеть, что компьютер превосходит вес по лимиту, потому не был добавлен
        alisaBasket.print("Корзина Миши: ");
        System.out.println("Вес: " + alisaBasket.getTotalWeight() + " кг.");
        System.out.println("Прайс: " + alisaBasket.getTotalPrise() + " руб.");

        System.out.println("-------------------------------------");

        //Попробуем использовать конструктор со всеми параметрами
        Basket sashaBasket = new Basket("Молоко", 85, 0.2);
        sashaBasket.print("Корзина Саши: ");
        System.out.println("Цена: " + sashaBasket.getTotalPrise() + " руб.");
        System.out.println("Вес " + sashaBasket.getTotalWeight() + " кг.");

        //корзина Саши после очистки
        sashaBasket.clear();
        sashaBasket.print("Корзина Саши: ");

        System.out.println("-------------------------------------");
        //Пробуем вызвать конструктор с лимитом по цене и весу
        Basket katyaBasket = new Basket(5000, 0.5);
        katyaBasket.add("Помада", 800, 2, 0.1);
        katyaBasket.add("Блеск для губ", 2000, 1, 0.2);
        katyaBasket.add("Набор для ванной", 4000, 1, 1);
        katyaBasket.add("Что-то женское", 10000, 2, 2);

        //Можем увидеть, что набор превосходит по весу, значит не будет добавлен, а также
        //Что-то женское превосходит по цене, значит также не будет добавлено
        katyaBasket.print("Корзина кати: ");
        System.out.println("Прайс: " + katyaBasket.getTotalPrise() + " руб.");
        System.out.println("Вес " + katyaBasket.getTotalWeight() + " кг.");

    }
}
