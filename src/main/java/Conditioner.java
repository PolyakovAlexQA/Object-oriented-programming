public class Conditioner {

    private boolean on;
    private int maxTemperature = 24;
    private int minTemperature = 17;
    private int currentTemperature;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on =  on;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }


    public void increaseCurrentTemperature(){
        if (!isOn()) return;
        if (currentTemperature >= maxTemperature)
            return;
        currentTemperature++;
    }

    public void decreaseCurrentTemperature(){
        if (!isOn()) return;
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }
}