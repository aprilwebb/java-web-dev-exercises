package exercises.technology;

public class Computer {
    private String brand;
    private double displaySize;
    private double memoryGb;

    public Computer(String brand, double displaySize, double memoryGb) {
        this.brand = brand;
        this.displaySize = displaySize;
        this.memoryGb = memoryGb;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(double memoryGb) {
        this.memoryGb = memoryGb;
    }

    public static String processData(){
        return "Data processed";
    }

    public static String save(String fileName){
        return fileName + " saved successfully.";
    }

    public static String powerOn(){
        return "Power on";
    }

}
