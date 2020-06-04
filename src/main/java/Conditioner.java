public class Conditioner {
    private String name = "кондишн";
    private int maxTemperature = 24;
    private int minTemperature = 17;
    private int currentTemperature = 20;
    private boolean on;

    public String getName() {
        return name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }


    public int setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        return currentTemperature;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;

    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature--;

    }
}

