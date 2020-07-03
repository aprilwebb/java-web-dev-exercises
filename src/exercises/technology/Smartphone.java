package exercises.technology;

public class Smartphone extends Computer{
    private double cameraMp;

    public Smartphone(String brand, double displaySize, double memoryGb, double cameraMp) {
        super(brand, displaySize, memoryGb);
        this.cameraMp = cameraMp;
    }

    public double getCameraMp() {
        return cameraMp;
    }

    public void setCameraMp(double cameraMp) {
        this.cameraMp = cameraMp;
    }
}
