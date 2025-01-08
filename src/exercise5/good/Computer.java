package exercise5.good;

public class Computer {
    private DeviceInput deviceInput;

    public Computer(DeviceInput deviceInput) {
        this.deviceInput = deviceInput;
    }

    public void useDevice() {
        deviceInput.use();
    }

}
