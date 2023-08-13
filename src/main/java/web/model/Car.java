package web.model;

public class Car {
    private String model;
    private String series;
    private double engineCapacity;

    public Car() {
    }

    public Car(String model, String series, double engineCapacity) {
        this.model = model;
        this.series = series;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
