package Task1;

public class Basket {
    private String item;
    private int totalPrise = 0;
    private int limitPrice;

    public int getTotalPrise() {
        return totalPrise;
    }

    private double totalWeight = 0;
    private double limitWeight;
    private static double countPrice;
    private static int countProduct;
    private static int countBasket;

    public Basket() {
        increaseBasket(1);
        item = """

                Список товаров:\s
                """;
        this.limitPrice = 100000;
        this.limitWeight = 100000;
    }

    public Basket(int limitPrice, double limitWeight) {
        this();
        this.limitPrice = limitPrice;
        this.limitWeight = limitWeight;
    }

    public Basket(int limit) {
        this();
        this.limitPrice = limit;
    }

    public Basket(double limitWeight) {
        this();
        this.limitWeight = limitWeight;
    }

    public Basket(String item, int totalPrise, double totalWeight) {
        this();
        this.item = this.item + item;
        this.totalPrise = totalPrise;
        this.totalWeight = totalWeight;
    }

    public static int getCountBasket() {
        return countBasket;
    }

    public void add(String name, int price) {
        add(name, price, 1, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 1);
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            System.out.println("Уже есть");
            return;
        }

        if (totalPrise + count * price >= limitPrice) {
            return;
        }

        if (totalWeight + weight * count >= limitWeight) {
            return;
        }

        item = item + "\n" + name + " - " + count + " шт. - " + price + "р." +  ", " + weight + " кг.";
        totalPrise = totalPrise + count * price;
        totalWeight = totalWeight + count * weight;
        increaseProduct(count);
        increasePrice(price * count);
    }

    public void clear() {
        item = "";
        totalPrise = 0;
        totalWeight = 0;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return item.contains(name);
    }

    public static void increaseProduct(int count) {
        Basket.countProduct += count;
    }

    public static void increasePrice(int price) {
        Basket.countPrice += price;
    }

    public static void increaseBasket(int count) {
        Basket.countBasket += count;
    }

    public static double averageCostProductInBaskets() {
        double countPrice = getCountPrice() * getCountBasket();
        int countProduct = getCountProduct() * getCountBasket();
        return countPrice / countProduct;
    }

    public static double averageCostBasket() {
        return getCountPrice() / getCountBasket();
    }

    public static int getCountProduct() {
        return countProduct;
    }

    public static double getCountPrice() {
        return countPrice;
    }

    public void print(String title) {
        System.out.print(title);
        if (item.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(item);
        }
    }
}
