package exercises.technology;

public class Laptop extends Computer {
        private Boolean portable = true;
        private double weight;
        private double batteryLife;


    public Laptop(String brand, double displaySize, double memoryGb, Boolean portable,double weight, double batteryLife){
            super(brand, displaySize, memoryGb);
            this.portable = portable;
            this.weight = weight;
            this.batteryLife = batteryLife;
        }

        public Boolean getPortable () {
            return portable;
        }

        public void setPortable (Boolean portable){
            this.portable = portable;
        }

        public double getWeight () {
            return weight;
        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public static String print(String fileToPrint) {
            return "File sent to printer.";
        }
    }










