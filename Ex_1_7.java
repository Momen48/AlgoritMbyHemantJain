interface BulbInterface {
    public void turnOn();
    public void turnOff();
    public boolean isOnFun();
}
class Bulb implements BulbInterface {
    private boolean isOn=false;
    @Override
    public void turnOn() {
        isOn = true;
    }
    @Override
    public void turnOff() {
        isOn = false;
    }
    @Override
    public boolean isOnFun() {
        return isOn;
    }
}
public class Ex_1_7 {
    public static void main(String[] args) {
        Bulb b = new Bulb();
        System.out.println("bulb is on return : " + b.isOnFun());
        b.turnOn();
        System.out.println("bulb is on return : " + b.isOnFun());
    }
}
