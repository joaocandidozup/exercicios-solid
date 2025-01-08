package exercise5.good;

public class Main {
    public static void main(String[] args) {
        DeviceInput keyboard = new Keyboard();
        Computer computer = new Computer(keyboard);
        computer.useDevice();
    }
}