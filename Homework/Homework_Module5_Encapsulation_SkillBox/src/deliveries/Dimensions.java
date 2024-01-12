package deliveries;

public record Dimensions(double height, double weight, double depth) {
    public double calculationCargoVolume() {
        return height * weight * depth;
    }
}
