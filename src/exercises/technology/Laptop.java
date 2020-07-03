package exercises.technology;

public class Laptop extends Computer{
    private Boolean portable = true;
    private double weight;

    public Laptop(String brand, double displaySize, double memoryGb, Boolean portable, double weight) {
        super(brand, displaySize, memoryGb);
        this.portable = portable;
        this.weight = weight;
    }

    public Boolean getPortable() {
        return portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
