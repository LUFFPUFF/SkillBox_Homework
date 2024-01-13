package deliveries;

public record Deliveries(double dimensions, double mass, String location, boolean isTurn, int registrationNumber,
                         boolean isFragile) {

    public Deliveries setLocation(String location) {
        return new Deliveries(dimensions, mass, location, isTurn, registrationNumber, isFragile);
    }

    public Deliveries setDimensions(double dimensions) {
        return new Deliveries(dimensions, mass, location, isTurn, registrationNumber, isFragile);
    }

    public Deliveries setMass(double mass) {
        return new Deliveries(dimensions, mass, location, isTurn, registrationNumber, isFragile);
    }
}
