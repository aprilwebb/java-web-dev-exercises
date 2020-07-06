package exercises.technology;

public class Smartphone extends Computer {
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

    public static String takePic(String typeOfPic) {
        if (typeOfPic.equals("selfie")) {
            return "*Selfie taken!*";
        } else if (typeOfPic.equals("portrait")) {
            return "*Portrait taken!*";
        } else {
            return "*Picture taken!*";
        }
    }
}
