package deliveries;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions1 = new Dimensions(2, 3, 4);
        Dimensions dimensions2 = new Dimensions(5, 5, 5);

        double dimensionsCargo = dimensions1.calculationCargoVolume();
        double dimensionsCargo2 = dimensions2.calculationCargoVolume();

        Deliveries deliveries = new Deliveries(dimensionsCargo, 10, "Воронеж", true, 999, true);
        String isTurn = deliveries.isTurn() ? "можно" : "нельзя";
        String isFragile = deliveries.isFragile() ? "является хрупким" : "не является хрупким";

        deliveries = deliveries.setLocation("Москва");
        deliveries = deliveries.setMass(7);
        deliveries = deliveries.setDimensions(dimensionsCargo2);

        System.out.println("Объем груза: " + deliveries.dimensions() + "\n" +
                "Масса груза: " + deliveries.mass() + "\n" +
                "Адрес доставки: " + deliveries.location() + "\n" +
                "Можно ли поворачивать: " + isTurn + "\n" +
                "Регистрационный номер: " + deliveries.registrationNumber() + "\n" +
                "Является ли хрупки: " + isFragile);
    }
}
