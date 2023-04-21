package JavaTutorial;

public abstract class ParentAirCraft {
    public void createEngine() {
        System.out.println("create engine");
    }
    public void followSafetyGuidelines() {
        System.out.println("follow safety guidelines");
    }
    public abstract void setColor();
}
