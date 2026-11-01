
public class Television {

    private boolean on = false;
    private int channel = 1;

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if (on) {
            channel++;

            if (channel > 10) {
                channel = 1;
            }
        }
    }
}
