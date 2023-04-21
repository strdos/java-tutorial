package JavaTutorial;

public class AustralianTraffic implements CentralTraffic {
    public static void main(String[] args) {
        CentralTraffic ct = new AustralianTraffic();
        ct.greenGo();
        ct.redStop();
        ct.yellowWait();

        AustralianTraffic at = new AustralianTraffic();
        at.walk();
    }

    @Override
    public void greenGo() {
        System.out.println("greenGo");
    }
    @Override
    public void redStop() {
        System.out.println("redStop");
    }
    @Override
    public void yellowWait() {
        System.out.println("yellowWait");
    }

    public void walk() {
        System.out.println("walk - local class method");
    }

}
