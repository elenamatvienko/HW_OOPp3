public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxMovementSpeed;

    private static final String DEFAULT_VALUE = "default";
    private static final String DEFAULT_COLOR = "белый";


    public Transport(String brand, String model, int year, String country, String color, int maxMovementSpeed) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        this.year = year;
        this.country = country;
        this.maxMovementSpeed = maxMovementSpeed;
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        this.maxMovementSpeed = maxMovementSpeed;
    }

    @Override
    public String toString() {
        return " brand: " + brand + " model: " + model + " year: " + year +" country: " + country +
                " color: " + color + " maxMovementSpeed: " + maxMovementSpeed;
    }
}
