package JavaTutorial;

public class ChildAirCompany1 extends ParentAirCraft {
    public static void main(String[] args) {

        ChildAirCompany1 c = new ChildAirCompany1();
        c.createEngine();
        c.followSafetyGuidelines();
        c.setColor();
    }

    @Override
    public void setColor() {
        System.out.println("color is blue");
    }
}
