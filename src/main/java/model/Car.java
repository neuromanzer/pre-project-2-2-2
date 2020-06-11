package model;

public class Car {
    private String model;
    private String engineType;
    private Long price;

    public Car(String model, String engineType, Long price) {
        this.model = model;
        this.engineType = engineType;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String   toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", price=" + price +
                '}';
    }
}
