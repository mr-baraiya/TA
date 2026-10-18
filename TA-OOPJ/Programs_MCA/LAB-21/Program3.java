// Interface Device (powerOn), SmartDevice extends Device (connectInternet). SmartPhone implements both.[C]

interface Device {
    void powerOn();
}

interface SmartDevice extends Device {
    void connectInternet();
}

class SmartPhone implements SmartDevice {
    private String brand;

    public SmartPhone(String brand) {
        this.brand = brand;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " SmartPhone powered ON. Display active.");
    }

    @Override
    public void connectInternet() {
        System.out.println(brand + " SmartPhone connected to 5G / Wi-Fi network.");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " from " + brand + " SmartPhone...");
    }
}

public class Program3 {
    public static void main(String[] args) {
        // Device reference
        Device d = new SmartPhone("Samsung Galaxy S24");
        d.powerOn();

        // SmartDevice reference
        SmartDevice sd = new SmartPhone("Apple iPhone 15");
        sd.powerOn();
        sd.connectInternet();
    }
}
