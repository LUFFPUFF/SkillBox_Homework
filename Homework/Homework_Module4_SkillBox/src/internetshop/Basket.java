package internetshop;

public class Basket {
    private String item;
    private int totalPrise = 0;
    private int limit;
    private double totalWeight = 0;
    private double limitWeight;

    public Basket() {
        item = """

                Список товаров:\s
                """;
        this.limit = 100000;
        this.limitWeight = 100000;
    }

    public Basket(int limit, double limitWeight) {
        this();
        this.limit = limit;
        this.limitWeight = limitWeight;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
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

        if (totalPrise + count * price >= limit) {
            return;
        }

        if (totalWeight + weight * count >= limitWeight) {
            return;
        }

        item = item + "\n" + name + " - " + count + " шт. - " + price + "р." +  ", " + weight + " кг.";
        totalPrise = totalPrise + count * price;
        totalWeight = totalWeight + count * weight;
    }

    public void clear() {
        item = "";
        totalPrise = 0;
        totalWeight = 0;
    }

    public int getTotalPrise() {
        return totalPrise;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return item.contains(name);
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
